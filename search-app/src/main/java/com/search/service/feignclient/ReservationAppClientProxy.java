package com.search.service.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.search.model.Hotel;

@FeignClient("reservaion-service")
public interface ReservationAppClientProxy {

	@RequestMapping(value = "/reservation/reservedHotels/{geolocationId}", method = RequestMethod.GET)
	public List<Hotel> reserved(@PathVariable("geolocationId") int geolocationId);

}
