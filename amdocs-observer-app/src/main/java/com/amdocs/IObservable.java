package com.amdocs;

public interface IObservable {
	
	public void addSubscriber(IObserver Observer);
	public void removeSubscriber(IObservable Observer);
	public void notifyAllSubscribers(String message);

}
