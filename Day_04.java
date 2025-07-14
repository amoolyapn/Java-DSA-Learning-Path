// Creating a method
public class Day_04 {
    public void printMessage() {
        System.out.println("Hello, Geeks!");
    }
    public static void main(String[] args) {
        // Create an instance of the Method class
        Day_04 obj = new Day_04();
        
        // Calling the method
        obj.printMessage(); 
    }
}



//calling a method using a object of a class.
class add{
    int s = 0;  //instance variable 's' stores the sum

    public int addition(int a, int b){
        s = a+b;
        return s;

    }
}
class Day_04{
    public static void main(String[]args){
        add sum = new add();
        int res = sum.addition(22,4); //Method calling - Calls the addition() method on the object sum
        System.out.println("Sum:"+res);
    }
}



//Access modifier -  control where a variable or method can be used in the program.

//DEFAULT - no access modifier used (package-private) - no keyword
class student{ //no modifier
    String name = "Amoolya";
}
public class Day_04{
    public static void main(String[]args){
        student s1 = new student();
        System.out.println("Name:"+s1.name);
    }
}


//PRIVATE - uses a Private keyword (only accessible within the same class.)
//not accessed from another class — not even in main()
class person{
    private String name = "Amoolya";
    private int age = 21;

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
}
public class Day_04{
    public static void main(String[]args){
    person girl = new person();
    System.out.println("Name:"+girl.getname());
    System.out.println("Age:"+girl.getage());
    }
}
    

//PROTECTED -  specified using the keyword protected.
//The methods or data members declared as protected are accessible within
// the same package or subclasses in different packages.
class person{
    protected String name = "Aishwarya";
}
public class Day_04 extends person{
    public static void main(String[]args){
    Day_04 girl = new Day_04();
    System.out.println("Name: "+girl.name);
    }
}


//PUBLIC - specified using the keyword public. - accessible from anywhere:
//Same class, Same package, Different package, Subclass or not
class person{
    public String name = "Parvathamma";
}
public class Day_04{
    public static void main(String[]args){
        person p1 = new person();
        System.out.println("Name: "+p1.name);
    }
}