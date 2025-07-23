
//LOOPS
//for loop
import java.io.*;
class Day_12{
    public static void main(String[]args){
        for (int i=0;i<=5;i++){   //from 0 to 5
            System.out.println(i+"");
        }
    }
}


//2
// Java program to demonstrate 
// the working of for each loop
import java.io.*;

class  Day_12 {
    public static void main(String[] args)
    {
        String[] names = { "Sweta", "Gudly", "Amiya" };

        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}


// While loop - check the condition before executing the loop body.
import java.io.*;
class Day_12{
    public static void main(String[]args){
        int i = 0;
        while(i<=10){
        System.out.println(i +" ");
        i++;
    }
}
}


//Do-while
import java.io.*;
class Day_12{
    public static void main(String[]args){
        int i=0;
        do{
            System.out.println(i+"");
            i++;
        }while(i<5); 
    }
}


//For-each
// Java Program to Iterate through an array
// Using for-each loop
import java.io.*;

class Geeks {
  
    public static void main(String[] args) {
      
        // Array declaration
        int arr[] = { 1, 2, 3, 4, 5 };
        
        // Using for-each loop to 
        // print each element
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}


