package DSA.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbersArray = new int[10];
        numbersArray[0] = 2;
        numbersArray[1] = 3;
        numbersArray[2] = 4;
        numbersArray[3] = 5;
        numbersArray[4] = 6;
        numbersArray[5] = 7;
        numbersArray[6] = 8;
        numbersArray[7] = 9;
        numbersArray[8] = 10;
        numbersArray[9] = 11;
        // for (int i : numbersArray) {
        //     System.out.println(i);
        // }
        for (int i = numbersArray.length-1; i >= 0; i--) {
            System.out.println(numbersArray[i]);
        }
    }
}
