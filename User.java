public class User {
    String username = "Dan";
    String password = "Pass";
    String login() {
        if (username.equals("Dan") && password.equals("Pass")) {
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
