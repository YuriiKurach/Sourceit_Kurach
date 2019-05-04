/**
 * Created by Yura on 01.05.2019.
 */
import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args){

        int a;
        Scanner scn=new Scanner(System.in);

        if(scn.hasNextInt()){

            a=scn.nextInt();

            for(int i=(int)Math.sqrt(a);i>=1;i--){
                if(a%i==0&i!=1){
                    System.out.println("Заданное число не простое");
                    break;
                }
                if(i==1) System.out.println("Заданное число простое");
            }
        }
        else System.out.println("Ошибка. Введено не число");

    }
}
