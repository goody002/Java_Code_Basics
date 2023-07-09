//SUM OF N NATURAL NUMBERS
import java.util.*;
public class prac{
    public static void sumn(int i, int n, int sum){
        if(i == n){
            sum = sum + i;
            System.out.println(sum); //printing the sum
            return;
        }

         sum = sum + i; //asli kaam
        sumn(i+1, n, sum); //calling itself
        System.out.println(i);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        sumn(1,n,0);
    }
}