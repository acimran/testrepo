package com.selenium;

import java.util.Scanner;

public class interactive_prog {

	public static void main(String[] args) throws Exception{
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter first number- ");  
			int a= sc.nextInt();  
			System.out.print("Enter second number- ");  
			int b= sc.nextInt();  
			System.out.print("Enter third number- ");  
			int c= sc.nextInt();  
			int d=a+b+c;  
			System.out.println("Total= " +d);
		}  
		catch(Exception e) {
			System.out.println("please check the inpupt");
		}
	}

}
