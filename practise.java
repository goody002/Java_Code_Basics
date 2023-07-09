import java.util.*;

public class practise {
    public static void main(String args[]){
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        size = sc.nextInt();
        int a[] = new int[size];
        for(i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("after sorting");
        for(i=0;i<size;i++){
            System.out.println(a[i]);
        }
        System.out.println("Min element = " + a[0]);
        System.out.println("Max element = " + a[size-1]);
    }
    
}
