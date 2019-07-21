package com.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.model.Hotel;
import com.search.service.SearchService;

@RestController
public class SearchController {

	@Autowired
	private SearchService searchService;

	@RequestMapping("/reserved/{geolocationId}")
	public List<Hotel> searchReservedHotel(@PathVariable("geolocationId") int geolocationId) {
		List<Hotel> reservedHotel = searchService.searchReservedHotel(geolocationId);
		return reservedHotel;
	}

	@GetMapping("healthCheck")
	public String isServiceUp() {
		return "Search Service is Up !!!";
	}
}
