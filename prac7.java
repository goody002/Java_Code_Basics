//package BASIC.java.BASIC;
import java.util.*;

public class prac7 {
    public static int calpow(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        //int temp = calpow(x,n-1);
        //int fi = x * temp;
        //return temp;
        
        //if n is even
        if(n % 2 == 0){
             return calpow(x, n/2) * calpow(x, n/2);
        }
        else{
            //if n is odd
            return calpow(x, n/2) * calpow(x, n/2) * x ;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x: ");
        int x = sc.nextInt();
        System.out.println("enter n: ");
        int n = sc.nextInt();

        int fi = calpow(x, n);
        System.out.println(fi);

    }
    
}
