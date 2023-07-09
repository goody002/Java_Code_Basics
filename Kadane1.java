import java.io.*;
import java.util.*;
  
class Kadane1 {
    // Driver Code
    public static void main(String[] args)
    {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }
  
    // Function Call
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int MAXsum = 0;
        int currentSum = 0;
  
        for (int i = 0; i < size; i++) {
            currentSum = currentSum + a[i];
            if(currentSum > MAXsum){
                MAXsum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return MAXsum;
    }
}