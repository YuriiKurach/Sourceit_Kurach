/**
 * Created by Yura on 01.05.2019.
 */

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        System.out.println(SumInpuNum(inputNumber));

    }

    public static int SumInpuNum(int inputNumber) {
        int sum = 0;
        while (inputNumber != 0) {
            sum += (inputNumber % 10);
            inputNumber /= 10;

        }
        return sum;
    }
}