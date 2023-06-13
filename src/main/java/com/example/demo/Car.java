package com.example.demo;

public class Car extends Vehicle {
	protected String brand;
	
	Car(int wheels, String brand) {
		super(wheels);
		this.brand = brand;
	}

	@Override
	public void go() {
		System.out.println(this.brand + " car is driving forward.");		
	}

	@Override
	public void stop() {
		System.out.println(this.brand + " car is stopping.");		
	}
	
	public void honk() {
		System.out.println(this.brand + " car is yelling pyp pyp pyp.");		
	}
	
	public String getBrand() {
		return this.brand;
	}
}
