package com.Calculator.logic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("The World's Finest Calculator!\n\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie Zahl eins ein:");
		double x = scan.nextInt();
		System.out.println("Bitte geben Sie Zahl zwei ein:");
		double sum = x + scan.nextInt();
		System.out.println("Summe / Produkt = "+ sum + "/" + ((sum-x)*x) + " = "+ sum/((sum-x)*x));

	}

}
