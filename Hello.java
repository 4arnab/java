import java.util.Scanner;

public class Hello {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double hight = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the hight: ");
        hight = scanner.nextDouble();

        area = width * hight;
        System.out.println("The Area is " + area + "cm^2");

        scanner.close();
        // System.out.println("Hello, world! FIRST TIME FOR EVERYTHING!");
    }
}