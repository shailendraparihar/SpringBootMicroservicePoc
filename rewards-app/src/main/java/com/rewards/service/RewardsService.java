package com.rewards.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rewards.model.Customer;

@Service
public class RewardsService {

	public static List<Customer> customers = new ArrayList<>();

	public void createDefaultCustomerList() {

		System.out.println("CREATING DEFAULT CUSTOMER LIST");
		System.out.println("======================START==================");
		for (int i = 1; i <= 5; i++) {
			Customer customer = new Customer(i, "test name" + i, 8 + i, false);
			customers.add(customer);

		}
		customers.forEach(System.out::println);
		System.out.println("=======================end=====================");
	}

	public Customer isEligibleForRewards(int customerId) {

		for (Customer customer : customers) {
			if (customer.getId() == customerId && customer.getNoOfOrders() > 10) {
				customer.setRewardsEligible(true);
			}
		}
		Optional<Customer> customer = customers.stream().parallel().filter(a -> a.getId() == customerId).findAny();

		return customer.orElse(null);
	}
}
