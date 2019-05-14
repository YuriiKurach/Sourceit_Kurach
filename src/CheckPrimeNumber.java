/**
 * Created by Yura on 01.05.2019.
 */
import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        int inputNum;
        Scanner scn = new Scanner(System.in);

        if (scn.hasNextInt()) {
            inputNum = scn.nextInt();
            for (int i = (int) Math.sqrt(inputNum); i >= 1; i--) {
                if (i == 1 || inputNum % i == 1) {
                    System.out.println("The given number is simple");
                }
                if (inputNum % i == 0 && i != 1)
                    System.out.println("The given number is not simple");
                break;
            }
        } else System.out.println("Mistake. No number entered");
    }
}