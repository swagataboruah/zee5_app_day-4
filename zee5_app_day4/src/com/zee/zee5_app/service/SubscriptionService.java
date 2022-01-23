package com.zee.zee5_app.service;

import java.util.Optional;

import com.zee.zee5_app.dto.Subscription;

public interface SubscriptionService {

	public String addSubs(Subscription subscription);
	public String updateSubs(String id, Subscription subscription);
	public Optional<Subscription> getSubsById(String id);
	public Subscription[] getAllSubs();
	public String delSubs(String id);
	
}
