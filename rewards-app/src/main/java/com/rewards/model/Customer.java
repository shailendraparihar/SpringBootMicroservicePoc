package com.rewards.model;

public class Customer {

	private int id;
	private String name;
	private int noOfOrders;
	private boolean rewardsEligible;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the noOfOrders
	 */
	public int getNoOfOrders() {
		return noOfOrders;
	}

	/**
	 * @param noOfOrders the noOfOrders to set
	 */
	public void setNoOfOrders(int noOfOrders) {
		this.noOfOrders = noOfOrders;
	}

	/**
	 * @return the rewardsEligible
	 */
	public boolean isRewardsEligible() {
		return rewardsEligible;
	}

	/**
	 * @param rewardsEligible the rewardsEligible to set
	 */
	public void setRewardsEligible(boolean rewardsEligible) {
		this.rewardsEligible = rewardsEligible;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", noOfOrders=" + noOfOrders + ", rewardsEligible="
				+ rewardsEligible + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, int noOfOrders, boolean rewardsEligible) {
		super();
		this.id = id;
		this.name = name;
		this.noOfOrders = noOfOrders;
		this.rewardsEligible = rewardsEligible;
	}

}
