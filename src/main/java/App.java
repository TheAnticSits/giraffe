import p1.MyClass;

public class App {

    public static void main(String[] args) {
//        System.out.println("Hello World");

/*        System.out.println("    /|");
        System.out.println("   / |");
        System.out.println("  /  |");
        System.out.println(" /___|");*/

        String characterName = "Dave";
        int characterAge = 20;

        System.out.println("There once was a man named " + characterName + ",");
        System.out.println("he was " + characterAge +" years old.  He really liked");
        characterName = "Mike";
        characterAge = 80;
        System.out.println("the name " + characterName + ", but didn't like being " + characterAge + ".");
        System.out.println("Most of his friends were also " + characterAge + ", and one");
        System.out.println("of them was also named " + characterName + ".");

}

}