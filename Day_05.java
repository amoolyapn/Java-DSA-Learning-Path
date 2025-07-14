//Arrays - collection of elements of the same data type, stored in a fixed-size memory block.
//1
public class Day_05 {
    public static void main(String[]args){
        int[] numbers = {10,20,30,40,50};

        for (int num : numbers){
            System.out.println(num);
        }
            System.out.println(numbers[1]);
        }
    }


//2 - 
public class Day_05 {
    public static void main(String[] args) {
        String[] name = {"Ammu", "Aishu", "Paru", "john"};

        int n = name.length;
        for (int i = 0; i < n; i++)
            System.out.println(name[i] + " ");
    }
}


//Array of objects - an array where each element is an object
// of a class, rather than a primitive type like int, char, etc.
//1
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    void showTitle() {
        System.out.println("Book Title: " + title);
    }
}

public class Day_05 {
    public static void main(String[] args) {
        // Create an array of Book objects
        Book[] books = new Book[2];

        // Initialize each object
        books[0] = new Book("Java Basics");
        books[1] = new Book("Data Structures");

        // Display each book title
        for (int i = 0; i < books.length; i++) {
            books[i].showTitle();
        }
    }
}


//2
class Student{
    String name;
    int marks;

    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class Day_05{
    public static void main (String[] args) {
        Student [] s1 = new Student[2];
        s1[0]=new Student("Amoolya",45);
        s1[1]=new Student("Aishwarya",39);
             
        for (Student stu:s1){
            System.out.println(stu.name + " " + stu.marks);

        }
    }
}


//One-Dimensional Array
public class Day_05{
    public static void main(String[]args){
        int[] marks={45,38,41};

        for(int i=0; i<marks.length; i++){
            System.out.println("Mark:"+(i+1) + ": "+ marks[i]);
        }
    }
}



//Two-Dimensional Array (Matrix)
public class Day_05{
    public static void main(String[]args){
        int[][] matrix = {
            {1,2,5},
            {3,4,6}
        };

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

}



//Passing Arrays to Methods
//1
public class Day_05{
    public static void main(String[]args){
        int arr []={1,2,3,4,5};

        //passing array to method 
        sum(arr);
    }
    public static void sum(int[] arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
            sum +=arr[i];
        System.out.println("sum of array values:"+sum);
    }
}


//2
public class Day_05{
    public static void main(String[]args)
    {
        int num[] = {1,2,3,4,5};
        sub(num);
    }
    public static void sub(int[]num)
    {
        int sub = 0;
        for(int i=0;i<num.length;i++)
            sub -=num[i];
        System.out.println("sub of values:" +sub);
    }
}




