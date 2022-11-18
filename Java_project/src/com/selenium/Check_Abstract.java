package com.selenium;

 
	abstract class A1 {
		  abstract void display();
		  void add(int a,int b)
		  {
		  int sum=a+b;
		  System.out.println("Addition of two numbers "+sum);
		  }
	}

	 public class Check_Abstract  extends A1
		{
		  void display()
		  {
		  System.out.println("Hello abstract");

		  }

 
				public static void main(String[] args)
				{
				// TODO Auto-generated method stub
		
					Check_Abstract c1=new Check_Abstract();
				c1.display();
				c1.add(3,33);
				}
		 
		
		}
