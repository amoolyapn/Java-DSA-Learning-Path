//Methods
public class Day_10{
    public static int add(int a,int b){
        return a+b;
    }
    public static void displayMessage(String message){
        System.out.println("Message:"+message);
    }
    public static void main(String[]args){
        int sum1 = add(2,4);
        System.out.println("Sum via direct method is:"+sum1);
    }
}


//Methods
public class Day_10{
    public static int add(int a,int b){
        return a+b;
    }
    public static void displayMessage(String message){
        System.out.println("Message:"+message);
    }
    public static void main(String[]args){
    MethodCallingExample obj = new MethodCallingExample();
    int sum2 = obj.add(2,6);
    System.out.println("Sum via method call using object:"+sum2);
    }
}


//OOPS
//1
// Use of Object and Classes in Java
import java.io.*;

class Numbers {
    // Properties
    private int a;
    private int b;

    // Setter methods
    public void setA(int a) { this.a = a; }
    public void setB(int b) { this.b = b; }

    // Methods
    public void sum() { System.out.println(a + b); }
    public void sub() { System.out.println(a - b); }

    public static void main(String[] args)
    {
        Numbers obj = new Numbers();

        // Using setters instead of direct access
        obj.setA(1);
        obj.setB(2);

        obj.sum();
        obj.sub();
    }
}


//2
// Use of Object and Classes in Java
import java.io.*;

class Numbers {
    // Properties
    private int a;
    private int b;

    // Setter methods
    public void setvalues(int a,int b){
        this.a=a;
        this.b=b;
        
    }

    // Methods
    public int sum() { 
       return a+b;
        
    }
        
    public int sub() {
        return a - b;
        }

    public static void main(String[] args)
    {
        Numbers obj = new Numbers();

        // Using setters instead of direct access
        obj.setvalues(1,2);

       System.out.println("Sum:"+obj.sum());
       System.out.println("Sub:"+obj.sub());
    }
}


//method overriding
class Animal{
    public void sound(){
        System.out.println("Animal barks");
    }
}
class Dog extends Animal{
      @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class Main{
    public static void main(String[]args){
        Animal a = new Dog();
        a.sound();
    }
}


//Abstaction - hides unnecessary details
//1
abstract class vehicle{
    abstract void accelerate();
    void StartEngine(){
        System.out.println("Engine starting..");
    }
}
class Car extends vehicle{

    @Override
    void accelerate(){
        System.out.println("Car pressing gas pedal..");
    }
}
public class Day_10{
    public static void main(String[]args){
        vehicle mycar = new Car();
        mycar.StartEngine();
        mycar.accelerate();
    }
}


//2
abstract class Animal {
    abstract void color();
    void sound(){
        System.out.println("Animal sounds so loud..");
    }
}
class Dog extends Animal{
    @Override
    void color(){
        System.out.println("Dog color is brown..");
    }
}
public class Day_10{
    public static void main(String[]args){
        Animal mya = new Dog();
        mya.sound();
        mya.color();

    }
}
