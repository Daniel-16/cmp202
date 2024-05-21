import Encapsulation.Person;

public class Main {
    public static void main(String[] args) {
        CMP202 printUser = new CMP202();
        printUser.printUserDetails();
        Person person = new Person();
        person.setName("Jane Doe");
        System.out.println(person.getName());
        System.out.println(person.setPassword("1243533"));;
        // person.password = "12344";
    }
}
