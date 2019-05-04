

/**
 * Created by Yura on 02.05.2019.
 */

import java.util.Arrays;

public class DoubleDimArray {
    public static void main(String[] args) {
        char[][] arr = new char[2][2];

        for (int i = 0; i < arr.length; i += 2) {
            for (int j = 0; j < arr.length; j += 2) {
                arr[i][j] = 'Ч';
                System.out.println(arr.length);
            }
            for (int j = 1; j < arr.length; j += 2) {
                arr[i][j] = 'Б';
            }
        }
        for (int i = 1; i < arr.length; i += 2) {
            for (int j = 0; j < arr.length; j += 2) {
                arr[i][j] = 'Б';
                System.out.println(arr.length);
            }
            for (int j = 1; j < arr.length; j += 2) {
                arr[i][j] = 'Ч';
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}


