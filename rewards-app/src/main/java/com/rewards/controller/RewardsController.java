package com.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.model.Customer;
import com.rewards.service.RewardsService;

@RestController
public class RewardsController {

	@Autowired
	private RewardsService rewardsService;

	@RequestMapping("/eligibility/{customerId}")
	public Customer isEligibleForRewards(@PathVariable("customerId") int customerId) {
		return rewardsService.isEligibleForRewards(customerId);
	}

	@GetMapping("/healthCheck")
	public String isServiceUp() {
		return "Rewards service is up!!!";
	}
}
