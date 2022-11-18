package com.selenium;


import java.io.*;

class FileHandle {
	
	public void write(File f) {
	String data = "Hello world from file io operations";
    try {
      // Creates a Writer using FileWriter
      FileWriter output = new FileWriter(f);

      // Writes string to the file
       
      output.write(data);
      
      System.out.println("Data is written to the file.");

      // Closes the writer
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
    
	}
	
	public void read(File f) {
		
		char[] array = new char[100];
	    try {
	      // Creates a reader using the FileReader
	      FileReader input = new FileReader(f);

	      // Reads characters
	      input.read(array);
	      System.out.println("Data in the file:");
	      System.out.println(array);

	      // Closes the reader
	      input.close();
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	}
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("F:\\Guru\\Java_Basics\\Test121333333.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
      try {
      
      FileHandle f= new FileHandle();
      
      System.out.println("The file write is called here");
      f.write(file);
      
      System.out.println("The file read is called here");
      f.read(file);
      
    }
      catch(Exception e1){e1.getStackTrace();}
  }
}