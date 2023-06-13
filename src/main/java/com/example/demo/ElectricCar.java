package com.example.demo;

public class ElectricCar extends Car {
	protected String model;
	protected String color;
	
	ElectricCar(int wheels, String brand, String model, String color) {
		super(wheels, brand);
		this.model = model;
		this.color = color;
	}
	
	@Override
	public void honk() {
		System.out.println(this.brand + " electric car is talking: GET OUT THE WAY.");		
	}
    
	@Override
	public String toString() {
		return "ElectricCar [brand=" + this.brand + ", color=" + this.color + ", model=" + this.model + "]";
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
}
