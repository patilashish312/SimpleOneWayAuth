package com.spr.boot2.OneWayAuth;

import java.util.Collections;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestHandler {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value = "/testCurrencies")
	public String restTemplateGet() {
		return restTemplate.getForObject("https://api.coinbase.com/v2/currencies", String.class);

	}

	@GetMapping(value = "/testCurrencies1")
	public ResponseEntity<byte[]> restTemplateGet1() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_PDF));
		HttpEntity<String> entity = new HttpEntity(headers);
		Stream.of("Ashish", "Patil").forEach(System.out::print);
		return restTemplate.exchange("https://api.coinbase.com/v2/currencies", HttpMethod.GET, entity, byte[].class);
	}

}
