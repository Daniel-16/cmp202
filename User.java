public class User {
    String username = "Dan-Codes";
    String password = "Pass@123";
    String login() {
        if (username.equals("Dan-Codes") && password.equals("Pass@123")) {
            return "Logged in";
        } else {
            return "Failed";
        }
    }
    public static void main(String[] args) {
        User jane = new User();
        System.out.println(jane.login());
    }
}
