package classes_objects;

import java.util.Scanner;

public class LaptopMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Laptop samsung = new Laptop();
		System.out.println("Please enter your display size :");
		samsung.display = sc.nextFloat();
		
		 
		System.out.println("Please enter yor Ram :");
		samsung.ram = sc.nextInt();
		System.out.println("Please enter your hardDisk size :");
		samsung.hardDisk = sc.next();
		System.out.println("Please Enter your input and output device :");
		samsung.inputDevice = sc.next();
		samsung.outputDevice = sc.next();
		
		System.out.println("==============================================");
		
		System.out.println("Your display size is = "+samsung.display);
		System.out.println("Your Ram size is = "+samsung.ram);
		System.out.println("Your HardDisk size is = "+samsung.hardDisk);
		System.out.println("Your Input device is = "+samsung.inputDevice);
		System.out.println("Your Output device is = "+samsung.outputDevice);
		
		System.out.println("Use your Favourite language :");
		samsung.development();
		System.out.println("In my free time i am :");
		samsung.entertainment();
		
		sc.close();
		
	}
}
