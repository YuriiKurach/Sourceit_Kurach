/**
 * Created by Yura on 01.05.2019.
 */

import java.util.Scanner;

public class SumOfRow {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int givenNum = scaner.nextInt();
        System.out.println(rowFactorial(givenNum));

    }

    public static int rowFactorial(int givenNum) {
        int sumFactorials = 1;
        int temp = 1;
        for (int i = 2; i <= givenNum; i++) {
            temp = -temp * i;
            sumFactorials += temp;
        }
        return sumFactorials;
    }


}