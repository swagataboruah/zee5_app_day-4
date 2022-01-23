package com.zee.zee5_app.serviceImpl;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.dto.Subscription;

import com.zee.zee5_app.repository.SubscriptionRepository;
import com.zee.zee5_app.service.SubscriptionService;

public class SubscriptionServiceImpl implements SubscriptionRepository {

	
	
	// singleton design
	private SubscriptionServiceImpl() {
		
	}
	private static SubscriptionService service;
	public static SubscriptionService getInstance() {
		if(service==null) {
			service = new SubscriptionServiceImpl();
		}
		return service;
	}
	
	SubscriptionRepository subscriptionRepository;
	
	@Override
	public String addSubs(Subscription subscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delSubs(String id, Subscription subscriptions1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSubs(String id, Subscription subscription1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subscription[] getAllSubs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subscription getSubsById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addUser(Register register) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register[] getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
