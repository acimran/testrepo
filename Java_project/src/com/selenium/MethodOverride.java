package com.selenium;

class A
{
public void display()
{
System.out.println("Parent");
}
}
class B extends A
{

  public void display()
{
   super.display();
   System.out.println("Child");

    } 


}
 class MethodOverride {
public static void main(String[] args)
{
B b1=new B();
  b1.display();
}

}

