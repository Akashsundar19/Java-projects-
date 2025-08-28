import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Adjective : ");
        String adj1 = s.nextLine();
        System.out.print("Noun : ");
        String n1 = s.nextLine();
        System.out.print("Adjective : ");
        String adj2 = s.nextLine();
        System.out.print("Verb : ");
        String verb1 = s.nextLine();
        System.out.print("Adjective : ");
        String adj3 = s.nextLine();

        System.out.println("Today I went to a " +adj1+ "zoo");
        System.out.println("In an exhibit, I saw a " + n1 + ".");
        System.out.println(n1 + " was " + adj2 + " and " + verb1 + "1");
        System.out.println("I was " + adj3 + "1");

        s.close();




    }
}