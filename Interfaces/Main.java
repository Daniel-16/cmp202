package Interfaces;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(new RAM(), new Processor(), new Storage());
        System.out.println(computer);
    }
}
