package com.selenium;

public class Lambda{
interface Animalss
{
public  void createSound();
}
public static void main(String[] args)

{
// TODO Auto-generated method stub

Animalss zooLion=new Animalss()
{
public  void createSound()
 {
System.out.println("Animal creates sound anonymous");
}
};
Animalss wildLion = ()-> {

System.out.println("Animal creates sound lambda");
 };

zooLion.createSound();

wildLion.createSound();

}
}


