/**
 * Created by Yura on 03.05.2019.
 */
public class PascalTriangle {

    private static final int[][] array = new int[10][10];


    public static void main(String[] args) {

        for(int i =0;i<array.length;i++) {
            int number = 1;
            System.out.format("%"+(array.length-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                System.out.format("%4d",number);
                number = number * (i - j) / (j + 1);

            }
            System.out.println();
        }
    }
}