public class CMP202 {
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 23;
        height = 172;
        name = "Dan-Codes";
        name.length();
        password = "User@123";
        if (password.contains("123") || password.contains("User")) {
            System.out.println("Password is not strong enough");
        }
    }
    public static void main(String[] args) {
        CMP202 printUser = new CMP202();
        printUser.printUserDetails();
    }
}
