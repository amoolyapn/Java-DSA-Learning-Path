//Constructors - A special method in a class that is called when an object is created to initialize the object.

// Default constructor 
import java.io.*;
class student{
    student(){
        System.out.println("Default constructor..");
    }

}
public class Day_09{    
    public static void main(String[]args){
        student s = new student();
    }
}


//a. Implicit constructor - no constructor is written java writes one.
import java.io.*;
class person{

}
public class Day_09{
    public static void amin(String[]args){
        person p =new person();
        System.out.println("Implicit constructor");
    }
}


//b. Explicit constructor - her constructor is created but no arguments are passed.
import java.io.*;
class Animal{
    Animal(){
        System.out.println("Explicit constructor");
    }
}
publi class Day_09{
    public static void main(String[]args){
        Animal a = new Animal(); //constructor prints message default no need to call println.
    }
}


// Parametrized constructor - constructor with defined parameters.
class Person{
    String name;
    int id;

    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class Day_09{
    public static void main(String[]args){
        Person p = new Person("swetha",123);
        System.out.println("Name:"+p.name+ "Id:"+p.id);
    }
}



//Copy constructor - it creates a new object by existing object of a same class
import java.io.*;
class person{
    String name;

    person(String name){
        this.name=name;
    }
    person(person p){
        this.name=p.name;
    }
}
public class Day_09{
    public static void main(String[]args){
        person p1=new person("Alice");
        person p2=new person(p1);
        System.out.println("Name:"+p1.name);
        System.out.println("Name:"+p2.name);
    }
}


//setting a different value to a copy constructor using set key
import java.io.*;
class person{
    String name;

    person(String name){
        this.name=name;
    }
    person(person p){
        this.name=p.name;
    }
    public setName(String name){
        this.name=p.name;
    }
}
public class Day_09{
    public static void main(String[]args){
        person p1=new person("Alice");
        person p2=new person(p1);

        p2.setName=("Ammu");
        System.out.println("Name:"+p1.name);
        System.out.println("Name:"+p2.name);
    }
}
    

//calling parent class using super() with no default constructor
import java.io.*;
class Animal{
    String name;

    Animal(String name){
        this.name=name;
    }
}
class Dog extends Animal{
    int age;

    Dog(String name,int age){
    super(name);
    this.age=age;
}
}

public class Day_09{
    public static void main(String[]args){
        Dog d=new Dog("Jaco",4);
        System.out.println("Name:"+d.name+ "Age:"+d.age);
    }
}



