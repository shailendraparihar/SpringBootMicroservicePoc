package com.reservation.model;

public class Customer {

	private int id;
	private String name;
	private int noOfOrders;
	private boolean rewardsEligible;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfOrders() {
		return noOfOrders;
	}

	public void setNoOfOrders(int noOfOrders) {
		this.noOfOrders = noOfOrders;
	}

	public boolean isRewardsEligible() {
		return rewardsEligible;
	}

	public void setRewardsEligible(boolean rewardsEligible) {
		this.rewardsEligible = rewardsEligible;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", noOfOrders=" + noOfOrders + ", rewardsEligible="
				+ rewardsEligible + "]";
	}

}
