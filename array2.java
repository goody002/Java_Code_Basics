import java.util.*;

public class array2 {
    public static void main(String args[]){
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        size = sc.nextInt();
        int num[] = new int[size];
        //input
        for(i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("enter the value of x: ");
        int x = sc.nextInt();
        //output
        for(i=0;i<size;i++){
            if(num[i] == x){
                System.out.println("x is found at index : " + i);
            }
            //System.out.println(num[i]);
    }
    
}
}
