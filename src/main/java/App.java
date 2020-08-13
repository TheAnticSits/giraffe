import p1.MyClass;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter in the first number: ");
        double num1 = keyboardInput.nextDouble();
        System.out.println("Enter in the second number: ");
        double num2 = keyboardInput.nextDouble();
        System.out.println(num1+num2);


/*        //getting user input tutorial 9

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = keyboardInput.nextLine();
        System.out.println("Enter Your Age: ");
        int age = keyboardInput.nextInt();
        System.out.println("Hey " + name + " you are " + age + " years old!");*/

/*//      printing hello world
        System.out.println("Hello World");*/

/*      //printing a shape
        System.out.println("    /|");
        System.out.println("   / |");
        System.out.println("  /  |");
        System.out.println(" /___|");*/


/*        //working with variables
        String characterName = "Dave";
        int characterAge = 20;

        System.out.println("There once was a man named " + characterName + ",");
        System.out.println("he was " + characterAge +" years old.  He really liked");
        characterName = "Mike";
        characterAge = 80;
        System.out.println("the name " + characterName + ", but didn't like being " + characterAge + ".");
        System.out.println("Most of his friends were also " + characterAge + ", and one");
        System.out.println("of them was also named " + characterName + ".");*/

/*        //working with datatypes

        String phrase = "To be or not to be";
        char grade = 'A';
        int age = 35;
        double gpa = 2.7;
        boolean isMale = true;

        System.out.println(phrase);
        System.out.println(age);
        System.out.println(gpa);
        System.out.println(grade);
        System.out.println(isMale);*/

/*        //working with Strings
        //new line
//        System.out.println("Giraffe \nAcademy");
        //adding quotations within a string
//        System.out.println("Giraffe \"Academy\"");
        //adding backslash
//        System.out.println("Giraffe \\Academy");
        //moving text to separate lines that still stay on same line in output
*//*        System.out.println("Giraffe Academy " +
                "adsdfa adfadfa");*//*
        //variable strings
       String phrase = "Giraffe Academy";
        System.out.println(phrase);
        //using methods within strings
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase.length());
        //boolean
        System.out.println(phrase.contains("Academy"));
        System.out.println(phrase.contains("dog"));
        //find character at index starts with 0
        System.out.println(phrase.charAt(1));
        System.out.println(phrase.charAt(4));
        //index of shows what index the character is at the first occurrence
        System.out.println(phrase.indexOf("f"));
        System.out.println(phrase.indexOf("affe"));
        //last index of shows last occurence
        System.out.println(phrase.lastIndexOf("a"));
        //substring all the text including and after the index number
        System.out.println(phrase.substring(8));
        //adding another index number to find a piece that is desired parameters stops before the second parameter.
        System.out.println(phrase.substring(8, 11));
        //method within another method
        System.out.println(phrase.substring(0, phrase.indexOf(" ")));
        System.out.println(phrase.substring(0, phrase.indexOf("d")));*/

/*        //working with numbers
        System.out.println(3);
        System.out.println(3+4);
        System.out.println(3-4);
        //truncates the decimal
        System.out.println(3/4);
        //changing datatype to a double for a decimal answer
        System.out.println(3.0/4.0);
        //Modulus gives the remainder
        System.out.println(10%3);
        //using variables in numbers
        int myInt = 3;
        double myDouble = -5.5;
        System.out.println(5 + myInt);
        //if you use a double and an int you get back a double
        System.out.println(myDouble + myInt);
        //Using MATH methods
        //getting absolute value
        System.out.println(Math.abs(myDouble));
        //using power first is what you want to use and second is to the power of
        System.out.println(Math.pow(myInt, 3));
        //squareroot
        System.out.println(Math.sqrt(36));
        //find the smaller number or largest
        System.out.println(Math.min(2, myDouble));
        System.out.println(Math.max(myDouble, myInt));
        //round decimal number
        System.out.println(Math.round(myDouble));
        //random
        System.out.println(Math.random());*/



}

}