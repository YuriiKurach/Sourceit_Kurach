/**
 * Created by Yura on 02.05.2019.
 */
import java.util.Arrays;

public class ArrayOfPrimeNumber {

    private final static  int[] myArray = new int[100];

    public static void main(String[] args) {
        int nextNumber = 2;
        int counter = 0;
        boolean isSimple;

        while (counter < 100) {
            int i = 0;
            isSimple = true;
            while (i<counter){
                if (nextNumber % myArray[i] == 0) {
                    isSimple = false;
                    break;
                }
                i++;
            }
            if (isSimple) {
                myArray[counter] = nextNumber;
                counter++;

            } else {
                nextNumber++;
            }
        }
        System.out.print(Arrays.toString(myArray));
    }
}


