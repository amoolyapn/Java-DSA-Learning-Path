// Array data types
public class Day_02 {
    public static void main(String[] args) {
        int[]num = {1,2,3};
        String[]arr = {"name","city","age"};

        System.out.println("First num is: " +num[0]);
        System.out.println("Second arr value is: "+arr[1]);

    }

}


//type-casting
float f =  5.6f;
int i = (int)f;
System.out.println(i); //output is 5 as it truncates the decimal part



// Variable data types
public class Day_02{
    public static void main(String[]args){
        int age = 25;
        String name = "Amoolya";

        System.out.println("Age:" +age);
        System.out.println("Name:" +name);

    }
}


// Local variables - defined within a block

import java.io.*;
public class Day_02{
    public static void main(String[]args){
        int i = 34;   // local variable
        String name = "John";  // local variable

        System.out.println("Value i is:"+i);
        System.out.println("Name is:"+name);

        if(i>23){
            String result = "i is greater than 25";  // result is also a local variable but accesible within a if block.
            System.out.println(result);
        }

        System.out.println(+i);
    }
}


// Instance variable - declared in a class outside of any method,block

import java.io.*;
class Day_02{
    public String name;  //defining a instance variable
    public int i;

    public Day_02()  // default constructor
    {
        this.name = "Amoolya";  //intializing instance variable
        this.i = 145;

    }
    public static void main(String[]args){  //main method
        Day_02 details = new Day_02();  //object creation(details)

        System.out.println(+details.name);
        System.out.println(+details.i); //accesing the value
    }
}


//Static variables - declared using static keyword, initialization is not mandatory.

import java.io.*;
class Day_02{
    public static String name = "Swetha";
    public static int x = 15;
    public static void main(String[]args){
        System.out.println("Name is:" +Day_02.name);
        System.out.println("x value is :"+Day_02.x);
    }

}


//2

// Main class 
public class Day_02{
  
    // Static block
    static
    {
        // Print statement
        System.out.print("Static block can be printed without main method");
    }
}