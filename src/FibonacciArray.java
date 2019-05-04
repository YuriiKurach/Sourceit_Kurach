/**
 * Created by Yura on 01.05.2019.
 */
public class FibonacciArray {
    public static void main(String[] args){
        int[] myArray=new int[20];

        for(int i=0;i<myArray.length;i++){

            if(i<2){
                myArray[i]=1;
            }

            else {
                myArray[i]=myArray[i-2]+myArray[i-1];
            }
            System.out.print(myArray[i]+" ");
        }
    }
}
