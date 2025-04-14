package CommonJavaProgramms;

public class FindSpecialChar {
    public static void main(String[] args) {
        String text = "Hell@o#Wo!rld123";

        System.out.println("Special char are: ");
        for (int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if (!Character.isLetterOrDigit(ch)){
                System.out.println(ch + " ");
            }
        }

        String CleanText= text.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("\nCleaned Text: " + CleanText);


    }
}
