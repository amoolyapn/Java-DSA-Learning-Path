//converting array list into list asList() method.
import java.util.Arrays;
public class Day_14 {
    public static void main(String[]args){
        int arr[]={10,2,0,30,40,50};
        System.out.println("Array to list:"+Arrays.asList(arr));
    }
}


//binarySearch() method searches for a key element using  bs algorithm.
import java.util.Arrays;
public class Day_14{
    public static void main(String[]args){
        int arr[]={10,20,22,60,50,30};
        Arrays.sort(arr);  //sorts in ascending order
        int key = 30;
        System.out.println("key is:"+Arrays.binarySearch(arr,key)); //works only on sorted array
    } 
}

//to compare() to arrays. 0 if both are equal, -1 if 1<2,  +1 if 1>2.
import java.util.Arrays;
public class Day_14{
    public static void main(String[]args){
        int arr[]={10,20,22,60,50,30};
        int arr1[]={10,68,46,78,98};
        Arrays.sort(arr);  //sorts in ascending order
        
        System.out.println("Integer arrays on comparision:"+Arrays.compare(arr,arr1)); //works only on sorted array
    } 
}

//copyOf(originalArray, newLength) Method -This method is used to copy the elements of an
// array into a new array of the specified new length.
// Java program to demonstrate
// Arrays.copyOf() method

import java.util.Arrays;

public class Day_14{
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To print the elements in one line
        System.out.println("Integer Array: "+ Arrays.toString(intArr));

        System.out.println("\nNew Arrays by copyOf:\n");

        System.out.println("Integer Array: "+Arrays.toString( Arrays.copyOf(intArr, 10)));
    }
}



import java.util.Arrays;

public class Day_14{
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To print the elements in one line
        System.out.println("Integer Array: "+ Arrays.toString(intArr));

        System.out.println("\nNew Arrays by copyOf:\n");

        System.out.println("Integer Array: "+Arrays.toString( Arrays.copyOfRange(intArr, 1,3)));
    }
}


// Can Be Reassigned But Not Re-referred
import java.util.*;

class Day_14 {
    public static void main(String[] args)
    {

        final int[] arr = { 1, 2, 3, 4, 5 };

        arr[4] = 1;
        arr[1]=22;
        arr[0]=56;
        arr[3]=78;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//adding elements
import java.util.ArrayList;
public class Day_14{
        public static void main(String[]args){
            ArrayList<String> student = new ArrayList<>();
            student.add("A");
            student.add("B");
            System.out.println("List"+student);
        }
}

