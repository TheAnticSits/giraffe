import p1.MyClass;

public class App {

    public static void main(String[] args) {
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


}

}