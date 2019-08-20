package com.amdocs;

import java.util.ArrayList;

public class PaperWala implements IObservable {
	
	private ArrayList<IObserver> subscribers;
	private String name;
	
	public PaperWala(String name) {
		subscribers = new ArrayList<IObserver>();
		
	}

	public void addSubscriber(IObserver Observer) {
		// TODO Auto-generated method stub
		subscribers.add(Observer);

	}

	public void removeSubscriber(IObservable Observer) {
		// TODO Auto-generated method stub
		subscribers.remove(Observer);

	}

	public void notifyAllSubscribers(String message) {
		// TODO Auto-generated method stub
		for (IObserver customer : subscribers)
			customer.update(message);

	}

}
