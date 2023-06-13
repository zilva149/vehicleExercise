package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ElectricCar car1 = new ElectricCar(4, "Tesla", "GT-500", "black");
		PetrolCar car2 = new PetrolCar(4, "Audi", "Super Duper", "red");
		DieselCar car3 = new DieselCar(4, "BMW", "Maroz Erelis", "silver");
		
		Car[] carsArr = {car1, car2, car3};
		
		for(Car car : carsArr) {
			carHonk(car);
		}
	}
	
	private static void carHonk(Car car) {
		car.honk();
	}

}
