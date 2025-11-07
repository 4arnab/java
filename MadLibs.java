import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        System.out.println("Welcome to mad libs game");
        System.out.println("-------------------------");

        Scanner scanner = new Scanner(System.in);

        String adjective = "";
        String noun1 = "";
        String adjective2 = "";
        String verb1 = "";
        String adjective3 = "";

        System.out.print("enter an adjective (description)");
        adjective = scanner.nextLine();

        System.out.print("enter a noun (animal or person)");
        noun1 = scanner.nextLine();

        System.out.print("enter an adjective (description)");
        adjective2 = scanner.nextLine();

        System.out.print("enter a verb end with -ing (action)");
        verb1 = scanner.nextLine();

        System.out.print("enter am adjective (description)");
        adjective3 = scanner.nextLine();

        System.out.println("Today  i went to a " + adjective + " zoo");
        System.out.println("in an exhibit, i saw a " + noun1 + ".");
        System.out.println(noun1 + " Was " + adjective2 + " and " + verb1 + "!");
        System.out.println("i was " + adjective3 +
                "!");

        scanner.close();
    }
}