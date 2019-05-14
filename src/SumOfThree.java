/**
 * Created by Yura on 01.05.2019.
 */
public class SumOfThree {

    public static void main(String[] args) {

        int totalSum = 0;

        for (int i = 0; i < 1000000; i++) {
            if (i / 100000 + (i / 10000) % 10 + (i / 1000) % 10 == (i / 100) % 10 + (i / 10) % 10 + i % 10) {
                totalSum = totalSum + 1;
            }
        }
        System.out.println(totalSum);
    }
}
