import java.io.*;
import java.util.Arrays;


public class Chocolate_distribution_problem {
    public static void main(String args[]){
        int a[] = {12, 4,  7,  9,  2,  23, 25, 41, 30,
            40, 28, 42, 30, 44, 48, 43, 50 };
        int m = 7;
        int i;
        Arrays.sort(a);
        int min_diff = Integer.MAX_VALUE;
        for(i=0;i+m-1<a.length;i++){
            int diff = a[i+m-1] -a[i];
            if(diff<min_diff){
                min_diff = diff;
            }
        }
        System.out.println( "min difference is" + min_diff);
    } 
}
