 // Java program to see how can we call
// an instance method without parameter

import java.io.*;

public class Day_03 {
      // static method
    public static void main (String[] args) {  
      
          // Creating object of the class
        Day_03 obj = new Day_03();          
      
          // Calling instance method
        obj.result();  
      
        System.out.println("DAY_03 Practice!");
    }
      
      // Instance method
    void result()                                  
    {
          // Local variable
        int a = 20;                              
        System.out.println(a);
    }
}
    

//2
// Java program to see how can we call
// an instance method without parameter

import java.io.*;

// Different class
class Day_03 {      
  
      // Instance method in different class 
    void add()                
    { 
      int a= 2;
      int b= 3;
      System.out.println("The sum of 2 and 3 is :" + (a+b));
    }
}
class Day_3 {
      // Static method
    public static void main (String[] args) {        
      
          // creating object of the class
        Day_03 obj = new Day_03();           
          
          // calling instance method
        obj.add();  
          
        System.out.println("HELLO WORLD");
    }
}



// Java program to see how can we call
// an instance method with parameter

import java.io.*;

class Day_03 {
      // static method
    public static void main (String[] args) { 
      
          // creating object
        Day_03 obj = new Day_03();            
      
          // calling instance method by passing value
        obj.add(2,3);    
      
        System.out.println("HI EVERYONE!");
    }
  
  // Instance method with parameter
  void add(int a, int b)          
  { 
    // local variables
    int x= a;                    
    int y= b;                    
    int z= x + y;             
    
    System.out.println("Sum : " + z);
  }
}



//Types of Instance methods:
// 1. Accesssor method (Getters)
// 2. Mutaator method (Setters)

public class Day_03{
    private String name;
    private int age;

    public String getName(){
    return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){  //get method
        return age;
    }

    public void setAge(int newAge){  //set method
        age = newAge;  
    }
    public static void main(String[]args){
        Day_03 Student = new Day_03();

        Student.setName ("Amoolya");
        Student.setAge (21);

        System.out.println("Name:" +Student.getName());
        System.out.println("Age:" + Student.getAge());
    }
}



//2
public class Day_03{
    private String model;
    private int number;

    public String getModel(){
        return model;
    }

    public void setModel(String newModel){
        model = newModel;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int newNumber){
        number = newNumber;

    }
    public static void main(String[]args){
        Day_03 car = new Day_03();
        car.setModel   ( "Duster");
        car.setNumber (5742);

        System.out.println("Car model:"+car.getModel());
        System.out.println("Car number:"+car.getNumber());

    }
}
