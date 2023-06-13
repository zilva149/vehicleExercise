package com.example.demo;

public class PetrolCar extends Car {
	protected String model;
	protected String color;
	
	PetrolCar(int wheels, String brand, String model, String color) {
		super(wheels, brand);
		this.model = model;
		this.color = color;
	}
	
	@Override
	public void honk() {
		System.out.println(this.brand + " petrol car is talking: MOVE OUT THE WAY.");		
	}
    
	@Override
	public String toString() {
		return "PetrolCar [brand=" + this.brand + ", color=" + this.color + ", model=" + this.model + "]";
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
}
