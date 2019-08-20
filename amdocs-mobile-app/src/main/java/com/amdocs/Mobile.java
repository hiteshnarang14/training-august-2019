package com.amdocs;

public class Mobile {
	
	private Camera camera;
	
	public Mobile() {
		camera = new Camera();
	}
	
	public Mobile(Camera mockedCamera) {
		this.camera = mockedCamera;
	}
	
	public boolean startPhotoApp() {
		System.out.println("Inside Start Photo App Method");
		
		if(camera.on()) {
		//if (true) {
			System.out.println("Positive code path");
			System.out.println("H/W interaction");
			return true;
		}
		System.out.println("Negative code path");
		System.out.println("Error Handling");
		return false;
	}

}
