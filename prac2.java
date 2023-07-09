import java.util.*;

public class prac2 {
    public static void natural(int i, int n, int sum){
        if(i==n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        natural(i+1, n, sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        natural(1, n, 0);
    }
    
}
