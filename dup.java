//package ARRAYS.java;
import java.util.*;
public class dup {
    public static void main(String args[]){
        int size, i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        size = sc.nextInt();
        int a[] = new int[size];
        for(i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<size;i++){
            if(a[i] == a[i+1]){
                System.out.println("yes duplicate present");;
            }
        }

    }
    
}
