package com.amdocs;

import java.util.*;

public class Contacts {
	
	private  HashMap<String, String> contacts;
	
	public Contacts()
	{
		this.contacts = new HashMap<String, String>();
	}
	
	public void addContact(String name, String mobileNo) {
		contacts.put(name, mobileNo);
	}
	
	public String findContactByMobileNo(String mobileNo) {
		String name = contacts.get(mobileNo);
		
		if (name == null)
			return mobileNo;
		else
			return name;
	}
	public static void main(String[] args) {
		Contacts contact = new Contacts();
		contact.addContact("1234567890", "Hitesh");
		
		System.out.println(contact.findContactByMobileNo("1234567890"));
		System.out.println(contact.findContactByMobileNo("123456789"));
	}

}
