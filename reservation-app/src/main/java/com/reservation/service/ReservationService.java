package com.reservation.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.reservation.model.Customer;
import com.reservation.model.Hotel;

@Service
public class ReservationService {

	@Autowired
	RestTemplate restTemplate;
	public static List<Hotel> hotels = new ArrayList<>();

	public Customer isEligibleForRewards(int userId) {

		/*
		 * Customer eligibleCustomer =
		 * restTemplate.getForObject("http://rewards-service/rewards/eligibility/" +
		 * userId, Customer.class); return eligibleCustomer;
		 */
		// Using rest template to call registered rewards-service service
		ResponseEntity<Customer> customer = restTemplate
				.getForEntity("http://rewards-service/rewards/eligibility/" + userId, Customer.class);
		return customer.getBody();

	}

	public List<Hotel> getReservedHotels(int geolocationId) {
		return hotels.stream().filter(h -> h.getGeolocationId() == geolocationId && h.isAvailableForBooking() == false)
				.collect(Collectors.toList());
	}

	public void createDefaultHotelList() {
		Hotel hotel1 = new Hotel(1, "hotelName1", 101, false);
		Hotel hotel2 = new Hotel(2, "hotelName2", 102, false);
		Hotel hotel21 = new Hotel(21, "hotelName21", 102, false);
		Hotel hotel22 = new Hotel(22, "hotelName22", 102, false);
		Hotel hotel3 = new Hotel(3, "hotelName3", 103, false);
		Hotel hotel31 = new Hotel(31, "hotelName31", 103, false);
		Hotel hotel32 = new Hotel(32, "hotelName32", 103, false);
		Hotel hotel4 = new Hotel(4, "hotelName4", 104, false);
		Hotel hotel5 = new Hotel(5, "hotelName5", 104, false);

		Collections.addAll(hotels, hotel1, hotel2, hotel21, hotel22, hotel3, hotel31, hotel32, hotel4, hotel5);
		// OR
		// List<Hotel> hotelList = Arrays.asList(hotel1, hotel2, hotel3, hotel4);
		// hotels.addAll(hotelList)hotel1;

	}

}
