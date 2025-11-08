import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Questions array
        String[] questions = {
                "1.What is your name?",
                "2.How old are you?",
                "3.Where do you live?",
                "4.What is your favorite programming language?",
                "5.What do you like to do in your free time?"
        };

        // Question options
        String[][] options = {
                { "1.Ahmed", "2. Abdi", "3.Jaamac" },
                { "1.10", "2. 21", "22" },
                { "1.Hyderabad", "2. Hargeisa", "3.Bangluru" },
                { "1.Java", "2. Javascript", "3.Golang" },
                { "1.Coding", "2. Playing football", "3.Nothing" },
        };

        // correct answers
        int[] answers = { 1, 3, 2, 1, 1 };
        double score = 0;
        int guess;

        // Welcome message
        System.out.println("Welcome to the java Quiz game\n=============================");

        // looping question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter you guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("CORRECT#");
                score += 1;
            } else {
                System.out.println("WRONG");
            }
        }

        System.out.println("Your final score is" + score);
        scanner.close();

    }
}
