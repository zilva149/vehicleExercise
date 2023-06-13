package com.example.demo;

public interface VehicleTool1 {
	default void accelerate (double speed) {
		System.out.println("Vehicle has accelerated by " + speed + " km/h amount.");
	}
}
