//reversing a string
//1
public class Day_15 {
    public static void main(String[]args){
        String a ="Ammu";
        String b ="";

        for(int i = a.length()-1 ;i>=0 ;i--){
            char ch = a.charAt(i); //get char from end
            String ch1 = Character.toString(ch); //convert char to string
            b=b.concat(ch1);
        }
        System.out.println(""+a);
        System.out.println(""+b);
    }
}


//2

public class Day_15{
    public static void main(String[]args){
        String a = "amma";
        String b = "";
        for(int i=a.length()-1;i>=0;i--){
            char ch = a.charAt(i);
            String ch1 = Character.toString(ch);
            b = b.concat(ch1);
        }
        System.out.println(""+a);
        System.out.println(""+b);
}
}

//index
public class Day_15{
    public static void main(String[]args){
        String s = "Learn share play";
        System.out.println("Index of share:"+s.indexOf("play"));
    }
}




// Java program to illustrate different 
// constructors and methods in String class
import java.io.*;
import java.util.*;

class Day_15
{
    public static void main (String[] args)
    {
        String s= "GeeksforGeeks";
        // or String s= new String ("GeeksforGeeks");

        // Returns the number of characters in the String
        System.out.println("String length = " + s.length());

        // Returns the character at ith index
        System.out.println("Character at 3rd position = "
                           + s.charAt(3));

        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(3));

        // Returns the substring from i to j-1 index
        System.out.println("Substring  = " + s.substring(2,5));

        // Concatenates string2 to the end of string1
        String s1 = "Geeks";
        String s2 = "forGeeks";
        System.out.println("Concatenated string  = " +
                            s1.concat(s2));

        // Returns the index within the string
        // of the first occurrence of the specified string
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " +
                           s4.indexOf("Share"));

        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index
        System.out.println("Index of a  = " +ugyeah
                           s4.indexOf('a',3));

        // Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);

        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + out);

        // If ASCII difference is zero then 
        // the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        
        // Converting cases
        String w1 = "GeeKyMe";
        System.out.println("Changing to lower Case " +
                            w1.toLowerCase());

        // Converting cases
        String w2 = "GeekyME";
        System.out.println("Changing to UPPER Case " +
                            w2.toUpperCase());

        // Trimming the word
        String w4 = " Learn Share Learn ";
        System.out.println("Trim the word " + w4.trim());

        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2);
    }
}



//String Buffer class
public class Day_15{
    public static void main(String[]args){
        StringBuffer s = new StringBuffer();
        s.append("Hello");
        s.append("  ");
        s.append("World");

        String s1 = s.toString();
        System.out.println(s1);
    }
}



