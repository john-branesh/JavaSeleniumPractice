package CommonJavaProgramms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to reverse: ");

        String word = input.next();
        String reversed ="";
        String rEversed ="";

        //Using for loop
        for (int i=word.length()-1; i>=0;  i--) {
            reversed = reversed+word.charAt(i);
        }
        System.out.println("reversed word: "+ reversed);

        //using while loop
        int i = word.length()-1;
        while (i>=0){
            rEversed +=word.charAt(i);
            i--;
        }

        System.out.println("reversed word: "+ rEversed);

        //using stringbuilder
        StringBuilder w = new StringBuilder(word);
        String Reversed = w.reverse().toString();
        System.out.println(Reversed);



    }
}
