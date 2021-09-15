package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle in centimeters: ");
        int length = input.nextInt();
        System.out.println("Thank you, now please enter the rectangles width in centimeters: ");
        int width = input.nextInt();
        System.out.println("Your rectangle has an area of " + (length * width) + "cm");
    }
}
