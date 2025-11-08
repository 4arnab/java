import java.util.Arrays;

public class JArrays {

    public static void main(String[] args) {
        String[] fruits = { "Apple", "Orange", "Tomato", "Lemon" };

        // 2D Arrays
        String[][] groceries = {
                fruits,
                { "potato", "onion", "orange" },
                { "chicken", "pork", "meet" },
        };

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }

            System.out.println();
        }

        char[][] telephone = { { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' } };

        for (char[] numbers : telephone) {
            for (char number : numbers) {
                System.out.print("| " + number);
            }
            System.out.println();
        }

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String target = "apple";
        boolean isFound = false;
        // Searching in a array
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(target)) {
                System.out.printf("Element found at index %s and the value is %s \n", i, target);

                isFound = true;
                break;
            }
        }

        if (!isFound)
            System.out.println("Target is not in the list");

        int numOfFruits = fruits.length;
        Arrays.sort(fruits);

        // for (int i = 0; i < fruits.length; i++) {
        // System.out.println(fruits[i]);
        // }

        // INHENSED FOR LOOP
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
