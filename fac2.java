//package BASIC.java.BASIC;
import java.util.*;

public class fac2 {
    public static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }

       int tempo = fact(n-1);
       int re = n * tempo ;
       return re;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int tempoo = fact(n);
        System.out.println(tempoo);

    }
    
}
