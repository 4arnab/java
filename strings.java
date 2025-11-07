import java.util.Random;

public class strings {

    public final static Random random = new Random();

    public static String generateUserName(String email, boolean loggingStatus) {

        System.out.println(loggingStatus ? "User logged in " : "login");
        String aToZ = "abcdefghijklmnopqrstuvwxyz";
        int index = random.nextInt(aToZ.length()); // getting index between 0 to the length of the aToZ

        // subtract first part of the email and add a random letter
        String userPart = email.substring(0, email.indexOf("@"));
        String username = userPart + "." + aToZ.charAt(index);

        return username;
    }

    public static void main(String[] args) {
        String password = "thisismypassword";
        String email = "axmedarnab@email.com".trim();

        if (!email.contains("@") || email.isEmpty()) {
            System.out.println("please enter a valid email");
        }
        System.out.printf("your email is %s and your password is %s\n", email, password);

        // SUBSTRINGS
        String firstPartOfEmail = email.substring(0, email.indexOf("@"));
        System.out.println(firstPartOfEmail);

        String userName = generateUserName(email, true);
        System.out.println(userName);
    }
}
