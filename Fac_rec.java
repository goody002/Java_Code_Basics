import java.util.*;

public class Fac_rec {
    public static int fib(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        int temp = fib(n-1);
        int res = n * temp;
        return res;
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int temp2 = fib(n);
        System.out.println(temp2);
    }
    
}
