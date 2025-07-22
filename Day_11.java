//Inheritance - here one class is allowed to inherit the features of another class by using extends key word
class Animal{
    void eat(){
        System.out.println("Animal eats.");
    }
    void sleep(){
        System.out.println("Animal sleps.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks.");
    }
}

public class Day_11{
    public static void main(String[]args){
        Dog mydog= new Dog();
        mydog.eat();
        mydog.sleep();
        mydog.bark();
    }
}



/* Polymorphism - it differentiate between entites with same name 
1.method overloading - compile time polymorphism
2.method overriding  - run time polymorphism
*/

class Parent{
    public void fun(){
        System.out.println("Parent fun()");
    }
    public void fun(int a){
        System.out.println("Parent fun(a)" +a);
    }
}
class Child extends Parent{
    @Override
    public void fun(int a){
        System.out.println("Child fun(int)"+a);
    }
}
public class Day_11{
    public static void main(String[]args){
        Parent parent = new Parent();
        Child child = new Child();

        Parent obj = new Child();
        parent.fun(); //method overloading
        parent.fun(10);
        child.fun(20);

        obj.fun(24); //polymorphism
    }
}



//Packages - a mechanism that encapsulates a group of classes, sub-packages, and interfaces. 
/* import java.util.* - for importing all classes
 import java.util.Vector.* - for importing a specific class i.e, Vector
 */

 // Import the Vector class from 

import java.util.Vector;

public class Geeks {
  
    public Geeks() {
      
        // java.util.Vector is imported, We are
        // able to access it directly in our code.
        Vector v = new Vector();
        v.add(2);
        v.add(1);

        System.out.println(v);

        // java.util.ArrayList is not imported
        // We are referring to it using the complete
        // package name.
        java.util.ArrayList l = new java.util.ArrayList();
        l.add(3);
        l.add(5);
        l.add(7);
        
        System.out.println(l);
    }

    public static void main(String[] args) {
      
        // Creating an instance of Geeks 
        // class to invoke the constructor
        new Geeks();
    }
}


//Static import in java

// Note static keyword after import.
import static java.lang.System.*;

class Geeks {
    public static void main(String args[]) {
      
        // We don't need to use 'System.out'
        // as imported using static.
        out.println("GeeksforGeeks");
    }
}



//Illustration of user-defined packages: Creating our first package: File name – ClassOne.java


package package_name;

public class ClassOne {
    public void methodClassOne()
    {
        System.out.println("Hello there its ClassOne");
    }
}


// Creating our second package: File name – ClassTwo.java


package package_one;

public class ClassTwo {
    public void methodClassTwo()
    {
        System.out.println("Hello there i am ClassTwo");
    }
}


// Making use of both the created packages: File name – Testing.java


import package_name.ClassOne;
import package_one.ClassTwo;

public class Testing {
    public static void main(String[] args)
    {
        ClassTwo a = new ClassTwo();
        ClassOne b = new ClassOne();
        a.methodClassTwo();
        b.methodClassOne();
    }
}



//Interface - an abstract type used to specify the behaviour of a class.
import java.io.*;

// Interface Declared
interface testInterface {
  
    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

// Class implementing interface
class TestClass implements testInterface {
  
    // Implementing the capabilities of
    // Interface
    public void display(){ 
      System.out.println("Geek"); 
    }
}

class Geeks
{
    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }

}
