import java.util.*;

public class practise2 {
    public static void main(String args[]){
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array: ");
        size = sc.nextInt();
        int a[] = new int[size];
        for(i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("before reversal:");
        for(i=0;i<size;i++){
            System.out.println(a[i]);
        }

        System.out.println("after reversal");
        for(i=size-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
    
}
