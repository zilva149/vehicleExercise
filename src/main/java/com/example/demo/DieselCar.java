package com.example.demo;

public class DieselCar extends Car {
	protected String model;
	protected String color;
	
	DieselCar(int wheels, String brand, String model, String color) {
		super(wheels, brand);
		this.model = model;
		this.color = color;
	}
	
	@Override
	public void honk() {
		System.out.println(this.brand + " diesel car is talking: RUN OUT THE WAY.");		
	}
    
	@Override
	public String toString() {
		return "DieselCar [brand=" + this.brand + ", color=" + this.color + ", model=" + this.model + "]";
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
}
