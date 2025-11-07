import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        System.out.println("Welcome to SHOPPING CART program");
        Scanner scanner = new Scanner(System.in);

        String item;
        double price = 10.0;
        int quantity;
        char currency = '$';

        System.out.print("What item would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("How many would you like to take: ");
        quantity = scanner.nextInt();

        // give the customer if the quantity => 10
        if (quantity > 10) {
            price = price - (price * 0.10);

            System.out.println("You have got a 10% discount, visit again");
        }

        System.out.println("Your have bought:" + item + " and the quantity is " + quantity + " each item is "
                + currency + price + " The total price is: " + quantity * price);

        scanner.close();
    }

}
