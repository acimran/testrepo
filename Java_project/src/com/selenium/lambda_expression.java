package com.selenium;
 
// Use a lambda expression in the ArrayList's forEach() method to print every item in the list:

import java.util.ArrayList;

public class lambda_expression {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}
