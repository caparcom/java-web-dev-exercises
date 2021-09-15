package exercises;
import java.util.Scanner;

public class Gas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please allow me to calculate your miles-per-gallon. Enter the number of miles you have driven: ");
        int miles = input.nextInt();
        System.out.println("Now if you would, please enter the amount of fuel your vehicle has used in gallons: ");
        int gas = input.nextInt();
        System.out.println("Calculating...your vehicles MPG is..." + (miles / gas));
    }
}
