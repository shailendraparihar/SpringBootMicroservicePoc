package com.search.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.search.model.Hotel;
import com.search.service.feignclient.ReservationAppClientProxy;

@Service
@EnableHystrix
public class SearchService {

	@Autowired
	ReservationAppClientProxy reservationAppClientProxy;
	
	@HystrixCommand(fallbackMethod = "fallbackSearchReservedHotels")
	public List<Hotel> searchReservedHotel(int geolocationId) {
		List<Hotel> reservedHotelDetails = reservationAppClientProxy.reserved(geolocationId);
		return reservedHotelDetails;
	}

	/**
	 * This method will be called if "searchReservedHotels()" fails
	 * @param geolocationId
	 * @return
	 */
	private List<Hotel> fallbackSearchReservedHotels(int geolocationId){
		System.out.println("search app :: SearchService :: inside fall back method");
		List<Hotel> hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel(9999, "ERROR", 9999, false));
		return hotels;
	}
}
