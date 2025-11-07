public class strings {

    public static void main(String[] args) {
        String password = "thisismypassword";
        String email = "info@email.com".trim();

        if (!email.contains("@") || email.isEmpty()) {
            System.out.println("please enter a valid email");
        }
        System.out.printf("your email is %s and your password is %s", email, password);
    }
}
