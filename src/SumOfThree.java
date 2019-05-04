/**
 * Created by Yura on 01.05.2019.
 */
public class SumOfThree {
    public static void main(String[] args){

        int n=0;

        for(int i=0;i<1000000;i++){
            int i1=i/100000%10,
                    i2=i/10000%10,
                    i3=i/1000%10,
                    i4=i/100%10,
                    i5=i/10%10,
                    i6=i%10;
            if((i1+i2+i3)==(i4+i5+i6)){
                n++;
            }
        }
        System.out.println(n);
    }
}
