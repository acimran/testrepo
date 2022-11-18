package com.selenium;

 
abstract class abstract1{
	   //abstract method
	   public abstract void sound();
	   // Implemented Method
	   public void display()
	   {
		   System.out.println("Display here");
	   }
	}
	 
	public class Abstract_Example extends abstract1{

	   public void sound(){
		System.out.println("hello abstract1");
	   }
	   public static void main(String args[]){
		   Abstract_Example obj = new Abstract_Example();
		obj.sound();
		obj.display();
	   }
	}