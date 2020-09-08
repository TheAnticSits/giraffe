import p1.MyClass;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

    //Tutorial 14 Return Statements


    //practice with methods
        System.out.println("Begin");
        Scanner digit = new Scanner(System.in);
        Scanner hitEnter = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = digit.nextLine();
        System.out.println(word + " is the word you entered.");
        System.out.println("Ready to have it broke down?  Press Enter.");
        String enter = hitEnter.nextLine();
        System.out.println("Your word is " + word.length() + " characters long.");
        System.out.println(word.toLowerCase() + " is your word in lowerCase.");
        System.out.println(word.toUpperCase() + " is your word in uppercase.");
        System.out.println("The third letter of your word is " + word.charAt(2));
        String newWord = "";
        int j = word.length();
        for(int i = 1; i <= word.length(); i++){
            newWord = newWord + word.charAt(j);
            j = (j - 1);
            if(j== -1){
                break;
            }
            System.out.println(newWord);
        }
        System.out.println(newWord);

}


}