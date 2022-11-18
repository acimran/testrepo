package com.selenium;

public class demo_class {
	
	public static void target_find(int a[], int t){
	int f=0;
		for(int i=0;i<8;i++) {
	
		  for(int j=i+1;j<8;j++) {
		    if (a[i]+a[j]==t && f!=1)
		    {
		       f=1; 
		       System.out.println("index values are "+i);
		       System.out.println("index values are "+j);
		     // System.out.println("Target is achieved");
		      break;
		      
			} 
			  
		}
	
	}
	
	if(f==1)
	{  System.out.println("Target is achieved");
	}
	else 
	{
	System.out.println("Target not achieved");
	}
	
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array = new int[]{ 1,2,3,4,5,6,7,8 }; 
		
		int target=10;
		target_find(Array,target);
		
		

	}

}
