//ANAGRAMS

import java.util.Arrays;

public class Day_13 {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        // Convert to char array
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}



import java.util.Arrays;
public class Day_13{
    public static void main(String[]args){
        String w1 = "SMILE";
        String w2 = "Miles";

        char[] arr1 = w1.toCharArray();
        char[] arr2 = w2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)){
            System.out.println("True");
         } else{
            System.out.println("False");
        }
        }

}

