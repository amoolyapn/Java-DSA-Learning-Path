//Strings 
import java.io.*;
public class Day_06 {
    public static void main(String[] args) {
        String s ="Amoolya";

        s.concat("Gowda"); //name is not added as String is immutable
        System.out.println(s);
    }
    
}


//explicitly assigning it to the reference variable.
import java.io.*;
class Day_06{
    public static void main(String[]args){
        String name = "APJ";
        name=name.concat("Kalam"); //prints the entire name
        System.out.println(name);  //explicit refernce variable
    }
}



// Construct String from subset of char array.
class Day_06{
    public static void amin(String[]args){
        byte ascii[]={71,70,71};
        String S1 = new String(ascii);
        System.out.println(S1);

        String S2 = new String(ascii,1,2);  // Start index to End Index
        System.out.println(S2);
    }
}


// Construct one string from another
class Day_06{
    public static void main(String[]args){
        char characters[]={'A','B','C'};
        String S1 = new String(characters);

        String S2 = new String(S1);

        System.out.println(S1);
        System.out.println(S2);
     }
}


//Regular Expression (REGEX) - special patterns used to match parts of strings.
import java.util.regex.*;  //imports all classes(Pattern,Matcher,MatchResult,PatternSyntaxException)
class Day_06{
    public static void main(String[]args){
        System.out.println(Pattern.matches("geeksfor","geeksforgeeks"); //returns true as pattern matches the text)

        System.out.println(Pattern.matches("gee*k","geeksfor"); //false

    }
}


//PATTERN CLASS
import java.util.regex.Pattern.*;  //imports only Pattern class
class Day_06{
    public static void main(String[]args){
        System.out.println(Pattern.matches("geeks","geeksfor");
    }
}


//MATCHER CLASS - Pattern searching
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Day_06{ //container for main method
    public static void main(String[]args){ //entry point
        Pattern p =Pattern.compile("geeks");
        
        Matcher m =p.matcher("geeksforgeeks");


        while(m.find())
        System.out.println("Pattern found:" +m.start()+ "to" +(m.end()-1));
    }
}