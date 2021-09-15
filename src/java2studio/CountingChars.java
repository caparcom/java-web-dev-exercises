package java2studio;
import java.util.HashMap;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hiddenFigures = "If the product of two terms is zero then common sense says at least one " +
                "of the two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the " +
                "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer > howMany = new HashMap<>();
        char[] cArr = hiddenFigures.toCharArray();
        for (char c: cArr){
            if (howMany.containsKey(c)){
                howMany.put(c, howMany.get(c) + 1);
            } else {
                howMany.put(c, 1);
            }
        }
        System.out.println(howMany);
    }
}
