// THIS IS SUBSCRIPTION INTERFACE
// THIS IS GOING TO BE IMPLEMENTED BY SUBSCRIPTIONREPOSITORYIMPL


// SubscriptionRepository will be marked as an interface and the specifications will be provided ie. the methodsci
// This Subscription should be available to all types of databases (refer example) that's y mark it as interface
// What ever the methods are declared over here should be overridden by every implementation

package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Subscription;

public interface SubscriptionRepository {

	public String addSubs(Subscription subscription);
	public String delSubs(String id, Subscription subscriptions1);
	public String updateSubs(String id, Subscription subscription1);
	public Subscription[] getAllSubs();
	public Subscription getSubsById(String id);
	public static SubscriptionRepository getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
 