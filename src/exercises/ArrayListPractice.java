package exercises;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListPractice {
        public static int sumEven(ArrayList<Integer> arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }
        public static void main(String[] args){
            ArrayList<Integer> someNumbers = new ArrayList<>();
                someNumbers.add(1);
                someNumbers.add(2);
                someNumbers.add(3);
                someNumbers.add(4);
                someNumbers.add(5);
                someNumbers.add(6);
                someNumbers.add(7);
                someNumbers.add(8);
                someNumbers.add(9);
                someNumbers.add(10);
                someNumbers.add(11);
                someNumbers.add(12);
            System.out.println(sumEven(someNumbers));
        }
}
