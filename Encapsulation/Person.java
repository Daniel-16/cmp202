package Encapsulation;

public class Person {
    private String name;
    private String schoolName = "Bingham with the difference";
    private String password;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
    public String setPassword(String password) {
        this.password = password;
        return "Password set successfully";
    }
}
