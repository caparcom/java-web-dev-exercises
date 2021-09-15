package exercises;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] newArr = {1, 1, 2, 3, 5, 8};
        for (int num : newArr){
            if (num % 2 != 0){
                System.out.println(num);
            }
        }
        String inABox = ("I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.");
        String[] wordArr = inABox.split(",");
        for (int i=0;i<wordArr.length;i++){
            System.out.println(wordArr[i]);
        }


    }
}
