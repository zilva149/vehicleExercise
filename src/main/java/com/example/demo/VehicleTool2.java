package com.example.demo;

public interface VehicleTool2 {
	static void calcVolume(double width, double height, double length) {
		double volume = width*height*length;
		System.out.printf("Volume: %.2f\n", volume);
	}
}
