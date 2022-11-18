package com.selenium;

import java.util.ArrayList;

 
public class Sort_array {
	
	
  
	public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	int i;
	boolean Flag=false;
	
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(6);
	a.add(5);
	
	System.out.println("Entered array is ");
	
	for(i=0;i<=4;i++) {
		System.out.println( "  "+a.get(i));
		
	}
	
	
	System.out.println("Search for the element 6 ");	
	
	for(i=0;i<=4;i++) {
		if(a.get(i)==7)
		{
			System.out.println("Search is successful  ");
			
			Flag=true;
			
			
			 
		}
	}
		if(!Flag)
		
		{
			System.out.println("Search is not successful  ");
			
		}
			
	 
	}

}