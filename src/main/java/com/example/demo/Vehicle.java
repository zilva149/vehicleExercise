package com.example.demo;

public abstract class Vehicle implements VehicleTool1, VehicleTool2 {
	protected int wheels;
	
	Vehicle(int wheels) {
		this.wheels = wheels;
	}
	
	abstract void go();
	abstract void stop();
}
