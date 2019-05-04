/**
 * Created by Yura on 02.05.2019.
 */
import java.util.Arrays;

public class ArrayOfPrimeNumber {
    public static void main(String[] args) {
        int a = 100;
        int[] myArray = new int[a];
        int nextNumber = 2;
        int counter = 0;
        boolean isSimple;
        while (counter < a) {
            int i = 0;
            isSimple = true;
            while (isSimple && i <counter){
                if (nextNumber % myArray[i] == 0) {
                    isSimple = false;
                }
                i++;
            }
            if (isSimple) {
                myArray[counter] = nextNumber;
                counter++;
                nextNumber++;
            } else {
                nextNumber++;
            }
        }
        System.out.print(Arrays.toString(myArray));
    }
}

