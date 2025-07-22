//Interfaces uses implements

// multiple interfaces (Add and Sub) to provide functionality for both addition and subtraction operations.


import java.io.*;
// Add interface
interface Add{
    int add(int a,int b);
}
// Sub interface
interface Sub{
    int sub(int a,int b);
}
// Calculator class implementing
// Add and Sub 
class Cal implements Add , Sub
{
    // Method to add two numbers
    public int add(int a,int b){
        return a+b;
    }
  
    // Method to sub two numbers
    public int sub(int a,int b){
        return a-b;
    }
  
}
class Day_12{
    // Main Method
    public static void main (String[] args) 
    {
        // instance of Cal class
        Cal x = new Cal();
      
        System.out.println("Addition : " + x.add(2,1));
        System.out.println("Substraction : " + x.sub(2,1));
      
    }
}


//Default
// interfaces can have methods from JDK 1.8 onwards
interface TestInterface
{
    final int a = 10;
    
  	default void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass implements TestInterface
{
    // Driver Code
  	public static void main (String[] args) {
        TestClass t = new TestClass();
        t.display();
    }
}


//Static
interface TestInterface
{
    final int a = 10;
    static void display()
    {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass implements TestInterface
{
    // Driver Code
    public static void main (String[] args)
    {
        TestInterface.display();
    }
}


//Private
interface Vehicle {
    // Private method for internal use
    private void startEngine() {
        System.out.println("Engine started.");
    }
    
    // Default method that uses the private method
    default void drive() {
         // Calls the private method
        startEngine(); 
        System.out.println("Vehicle is now driving.");
    }
}

class Car implements Vehicle {
    // Car class implements Vehicle interface and inherits the default method 'drive'
}

public class Day_12 {
    public static void main(String[] args) {
        Car car = new Car();
        // This will call the default method, which in turn calls the private method
        car.drive();  
    }
}


/* Functional
 This example demonstrates the use of a functional interface in Java, which contains
  exactly one abstract method and can be used with lambda expressions or method references.*/


@FunctionalInterface
interface MyFunctionalInterface {
    void singleAbstractMethod();
}
