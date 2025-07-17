//Object oriented programming
//Basic use of class
public class Day_08 {
        int id;
  
    // data member (also instance variable)
    String n;
  
    public static void main(String args[]) {
      
        // creating an object of
        // Student
        Day_08 s1 = new Day_08();
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}



// Java Program to initialize Java Object
// by using method/function
public class Day_08 {

    static String name;
    static float price;

    static void set(String n, float p) {
        name = n;
        price = p;
    }

    static void get()
    {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String args[])
    {
        Day_08.set("Visual studio", 0.0f);
        Day_08.get();
    }
}



//example 2
public class day_1{
    String name="amoolya";
    int age=12;

    public day_1(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[]args){
        day_1 dog = new day_1("amoolya",12);
        System.out.println("name"+dog.name);
        System.out.println("age"+dog.age);


    }
}


//calling parent class using super() keyword.
class Animal{
    Animal(){
    System.out.println("Animals are living things.");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog is a Animal.");

    }


}
public class Day_08{
    public static void main(String[]args){
        Dog d = new Dog();
    }
}


//example 2
class Animal1{
    Animal1(String name,int age){
        System.out.println("Animal name is:"+name +"and his age is"+age);
    }
}
class Dog1 extends Animal1{
    Dog1(){
        super("Jaco",2);
        System.out.println("Dog is friendly animal.");

    }
}
public class Day_08{
    public static void main(String[]args){
        Dog1 g= new Dog1();
    }
}