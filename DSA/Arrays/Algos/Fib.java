package DSA.Arrays.Algos;

public class Fib {
    // public static void main(String[] args) {
    //     Fib print = new Fib();
    //     print.printFibo(5);
    // }
    // void printFibo(int n) {
    //     int a = 0;
    //     int b = 1;
    //     for (int i = 1; i < n; i++) {
    //         System.out.println(a);
    //         int next = a + b;
    //         a = b;
    //         b = next;
    //     }
    // }
    public static void main(String[] args) {
        int first = 0, second = 1, next;
        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i < 10; i++) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
