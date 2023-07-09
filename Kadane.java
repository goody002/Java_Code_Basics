import java.io.*;
import java.util.*;

public class Kadane{
    public static void main(String args[]){
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("SIZE OF ARRAY: ");
        size = sc.nextInt();
        int a[] = new int[size];
        for(i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
    }

    int maxSum(int a[]){
        int i, size;
        int MAXsum = 0;
        int currentSum = 0;
        for(i=0;i<a.length;i++){
            currentSum = currentSum + a[i];
            if(currentSum > MAXsum){
                MAXsum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum(a);
    }
}