package User;

public class User {
    String name;
    String password;
    String login() {
        return "Logged in";
    }
    String logout() {
        return "Logged out";
    }
    String register() {
        if (name.equals("") || password.equals("")) {
            return "Can't be empty";
        } else {
            return "Successfull";
        }
    }
}
