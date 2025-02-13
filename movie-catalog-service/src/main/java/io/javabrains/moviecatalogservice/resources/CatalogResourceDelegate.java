package io.javabrains.moviecatalogservice.resources;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.UserRating;

@Service
public class CatalogResourceDelegate {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "callStudentServiceAndGetData_Fallback")
	public List<CatalogItem> callStudentServiceAndGetData(String userId) {
		UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + userId,
				UserRating.class);

		return userRating.getRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(),
					Movie.class);

			return new CatalogItem(movie.getName(), "Note", rating.getRating());

		}).collect(Collectors.toList());
	}

	@SuppressWarnings("unused")
	private String callStudentServiceAndGetData_Fallback(String userId) {

		System.out.println("CatalogItem Service is down!!! fallback route enabled...");

		return "CIRCUIT BREAKER ENABLED!!! No Response From CatalogItem Service at this moment. "
				+ " Service will be back shortly - " + new Date();
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
