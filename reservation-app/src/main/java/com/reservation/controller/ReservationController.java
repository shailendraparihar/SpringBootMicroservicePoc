package com.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.model.Customer;
import com.reservation.model.Hotel;
import com.reservation.service.ReservationService;

/**
 * @author ram
 *
 *         Controller to serve reservation related requests
 */
@RestController
public class ReservationController {

	@Autowired
	ReservationService reservationService;

	@RequestMapping("/{userId}")
	public Customer reserveHotel(@PathVariable("userId") int userId) {

		Customer eligibleCustomer = reservationService.isEligibleForRewards(userId);
		return eligibleCustomer;
	}

	@RequestMapping("/reservedHotels/{geolocationId}")
	public List<Hotel> reserved(@PathVariable("geolocationId") int geolocationId) {

		List<Hotel> reservedHotels = reservationService.getReservedHotels(geolocationId);
		return reservedHotels;
	}

	/**
	 * @return
	 */
	@GetMapping("/healthcheck")
	public String isServiceUp() {
		return "reservation service is up!!!";
	}
}
