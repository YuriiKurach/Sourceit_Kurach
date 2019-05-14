

/**
 * Created by Yura on 02.05.2019.
 */

import java.util.Arrays;

public class DoubleDimArray {

    private static final char[][] arr = new char[2][2];

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (((i + j) % 2) == 0) {
                    arr[i][j] = 'Ч';
                } else {
                    arr[i][j] = 'B';
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}



