package com.Calculator.logic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("\n\n\n");
		System.out.println("The World's Finest Calculator! Version1: OHNE\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie Zahl eins ein:");
		double x = scan.nextInt();
		System.out.println("Bitte geben Sie Zahl zwei ein:");
		double sum = x + scan.nextInt();
		System.out.println("Summe / Produkt = "+ sum + "/" + ((sum-x)*x) + " = "+ sum/((sum-x)*x));


		boolean randomStufftoIgnore = false;
		double z1 = 0.0;
		do{
			System.out.print("Bitte geben Sie Zahl eins ein: ");
			if(scan.hasNextDouble()){
				z1 = scan.nextDouble();
				randomStufftoIgnore = true;
			}else{
				scan.nextLine();
				System.out.println("Bitte eine Valide Zahl eingeben!");
			}
		}while(!randomStufftoIgnore);

		randomStufftoIgnore = false;
		double sum1 = 0.0;
		do{
			System.out.print("Bitte geben Sie Zahl eins ein: ");
			if(scan.hasNextDouble()){
				sum1 = scan.nextDouble()+z1;
				randomStufftoIgnore = true;
			}else{
				scan.nextLine();
				System.out.println("Bitte eine Valide Zahl eingeben!");
			}
		}while(!randomStufftoIgnore);
		System.out.println("Summe / Produkt = "+ sum1 + "/" + ((sum1-z1)*z1) + " = "+ sum1/((sum1-z1)*z1));
	}

}
