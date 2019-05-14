
import java.util.Scanner;

public class GreatestCommonDivider {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fistInputNum = in.nextInt();
        int secondInputNum = in.nextInt();

        while (fistInputNum != 0 && secondInputNum != 0) {
            if (fistInputNum > secondInputNum) {
                fistInputNum %= secondInputNum;
            } else {
                secondInputNum %= fistInputNum;
            }
        }
        System.out.println(fistInputNum + secondInputNum);
    }
}
