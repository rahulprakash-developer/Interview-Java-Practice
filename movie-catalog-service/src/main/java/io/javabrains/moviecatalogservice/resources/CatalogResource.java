package io.javabrains.moviecatalogservice.resources;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.moviecatalogservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

	private static final Logger LOG = Logger.getLogger(CatalogResource.class.getName());
	/*
	 * @Autowired WebClient.Builder webClientBuilder;
	 */

	@Autowired
	CatalogResourceDelegate catalogResourceDelegate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCalalog(@PathVariable("userId") String userId) {
		System.out.println("Going to call catalog service-------------");
		LOG.log(Level.INFO, "Going to call catalog service-------------");

		return catalogResourceDelegate.callStudentServiceAndGetData(userId);

	}
}

//Using WebClient as Rest Template is now deprecated

/*
 * Movie movie = webClientBuilder.build() .get()
 * .uri("http://localhost:8082/movies/" + rating.getMovieId()) .retrieve()
 * .bodyToMono(Movie.class)
 * 
 * .block();--If you are using block then you are converting asynchronous to
 * Shyncronous
 */
