package com.reservation.model;

public class Hotel {
	private int hotelId;
	private String HotelName;
	private int geolocationId;
	private boolean isAvailableForBooking;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int hotelId, String hotelName, int geolocationId, boolean isAvailableForBooking) {
		super();
		this.hotelId = hotelId;
		HotelName = hotelName;
		this.geolocationId = geolocationId;
		this.isAvailableForBooking = isAvailableForBooking;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return HotelName;
	}

	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public int getGeolocationId() {
		return geolocationId;
	}

	public void setGeolocationId(int geolocationId) {
		this.geolocationId = geolocationId;
	}

	public boolean isAvailableForBooking() {
		return isAvailableForBooking;
	}

	public void setAvailableForBooking(boolean isAvailableForBooking) {
		this.isAvailableForBooking = isAvailableForBooking;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", HotelName=" + HotelName + ", geolocationId=" + geolocationId
				+ ", isAvailableForBooking=" + isAvailableForBooking + "]";
	}

}
