package com.selenium;
 

interface interfacetest
{
 public void display1(int a);
 public void display2(int b);
}
public class Interface_Demo implements interfacetest{
public void display1(int a )
{
   System.out.println("Display1 : "+a);
}
public void display2(int b)
{
   System.out.println("Display2 : "+b);
}
public void add(int a,int b)
{
int c=a+b;
System.out.println("Addition of two numbers" +c);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
	Interface_Demo d1=new Interface_Demo();
d1.display1(5);
d1.display2(51);
d1.add(10,20);
//interfacedemo i=new interfacedemo();

}

}

 
