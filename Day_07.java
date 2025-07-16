//local variable - Program to demonstrate object creation and method calling in Java

public class Day_07 {
    public static void main(String[] args) {
        ammu obj = new ammu();
        obj.display();
    }

}
class ammu{
    void display(){
        System.out.println("Hello");
    }
    }


//Program to demonstrate static method and static variable in Java
public class Day_07{
    static int count = 0; //static variable

    static void display(){  //static method
        count++;
        System.out.println("Static method:"+ count + "times");
    }
    public static void main(String[]args){
        Day_07.display();
        Day_07.display();
    }

    }


// Program to demonstrate static block execution

public class Day_07 {
    static int number;

    // static block
    static {
        number = 10; //initializing
    }

    public static void main(String[] args) {
        System.out.println("Value of number: " + number);
    }
}


// Simple static variable example with object
public class Day_07{
    static String name = "Amoolya";
public static void main(String[]args){
    Day_07 person_name = new Day_07();
    System.out.println("Using object:" +person_name.name);
    System.out.println("Using class name:" +Day_07.name); //recommended
}
}


/*OBJECT ORIENTED PROGRAMMING AND INTERFACES
> class - blue print of an object.
> object - instance of an class */

class Day_07{
    String name;
    String breed;
    int age;
     public Day_07(String name,String breed,int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
     }

     public String getName(){
        return name;
     }
     public String getBreed(){
        return breed;
     }
     public int getAge(){
        return age;
     }
     @Override  //The toString() method is overridden to provide a custom string output when the object is printed.
     public String toString(){
        return("Name:"+this.getName()+ "\nBreed:"+this.getBreed()+ "\nAge:"+this.getAge());
     }
     public static void main(String[]args)
     {
        Day_07 Dog = new Day_07("Paplu","Papilon",23);
        System.out.println(Dog.toString());
     }
}

