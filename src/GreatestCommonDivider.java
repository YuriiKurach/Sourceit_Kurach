

import java.util.Scanner;

public class GreatestCommonDivider {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int b = in.nextInt();

            while (a!=0 && b!=0) {
                if (a > b) {
                    a = a % b;
                }
                else  {
                    b = b % a;
                }
            }
            System.out.println(a+b);
        }
}


