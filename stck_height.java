//package BASIC.java.BASIC;
import java.util.*;

public class stck_height {

    public static int calpow(int x, int n){
        if(n == 0){ //base case 1
            return 1;
        }
        if(x == 0){ //base case 2
            return 0;
        }
        int xpow = calpow(x, n-1) ; //kaam
        int final_xpow = x * xpow;
        return final_xpow;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x: ");
        int x = sc.nextInt();
        System.out.println("enter n: ");
        int n = sc.nextInt();
        int temp = calpow(x,n);
        System.out.println(temp);
    }
    
}
