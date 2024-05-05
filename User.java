public class User {
    String username = "Dan-Codes";
    String email = "daniel@mail.com";
    String login() {
        if (username.equals("Dan-Codes") && email.equals("daniel@mail.com")) {
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
