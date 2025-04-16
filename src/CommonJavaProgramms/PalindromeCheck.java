package CommonJavaProgramms;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = n.next();

        String palindrome = "";

        for (int i=word.length()-1; i>=0; i--){
            palindrome+=word.charAt(i);
        }

        if (palindrome.equals(word)){
            System.out.println("word is palindrom");
        }
        else {
            System.out.println("Word is not palindrome");
        }
        System.out.println(palindrome);



        //using stringbuilder
        StringBuilder w = new StringBuilder(word);
        String reverse = w.reverse().toString();
        System.out.println(reverse);

        if (reverse.equals(word)){
            System.out.println("word is palindrom");
        }
        else {
            System.out.println("Word is not palindrome");
        }
        System.out.println(palindrome);

    }
}
