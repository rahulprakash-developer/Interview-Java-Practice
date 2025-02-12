package io.javabrains.ratingsdataservice;

import org.springframework.web.client.RestTemplate;

public class TestRest {

	public static void main(String[] args) {
		getMessage();
	}

	private static void getMessage() {

		String uri = "http://localhost:8081/api/createUser";

		RestTemplate rest = new RestTemplate();

		String result = rest.getForObject(uri, String.class);

		System.out.println(result);
	}

}
