//package ARRAYS.java;
import java.util.*;

import java.util.*;
public class reverse {
    public static void main(String args[]){
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("The values of array are : ");
        for(i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("before reverse: ");
        for(i=0;i<size;i++){
            System.out.println(num[i]);
        }
        System.out.println("after reversing: ");
        for(i=size-1;i>=0;i--){
            System.out.println(num[i]);
        }
    }
    
}
