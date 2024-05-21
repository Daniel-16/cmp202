import Encapsulation.Person;

public class Main {
    public static void main(String[] args) {
        CMP202 printUser = new CMP202();
        printUser.printUserDetails();
        Person person = new Person();
        System.out.println(person.getName());
        person.setName("Jane Doe");
        // person.password = "12344";
    }
}
