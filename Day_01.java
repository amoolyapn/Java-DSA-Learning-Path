//Datatypes - PRIMITIVE
//Boolean
public class Day_01 {
     public static void main(String[]args){
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("Is java easy?" +b1);
        System.out.println("Is fish alive?" +b2);

    }
}



//Byte (1byte - 8bits) range(-128 127)
public class Day_01 {
    public static void main(String[]args){
        Byte  x = 12;
        Byte  y = 13;

        System.out.println("value of x: " +x);
        System.out.println("value of y: " +y);

    }
}



//float data type (4bytes - 32bits)
public class Day_01 {
    public static void main(String[]args){
        float x = 123.3f;
        float y = 1357.1f;

        System.out.println("value of x: " +x);
        System.out.println("value of y: " +y);

    }
}



//NON - PRIMITIVE
class car{    //defining a class
    String model;
    int year;

    car(String model, int year){   //constructor
        this.model = model;
        this.year = year;
    }
}
    public class Day_01{
        public static void main(String[]args){

            car mycar = new car("Bmw",2022);   //object creation
            System.out.println("The car model is:" +mycar. model); //accesing and printing the value
            System.out.println("The manufacture year is:" +mycar.year);
        }
    }
