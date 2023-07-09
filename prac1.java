import java.util.*;

public class prac1 {
    public static void main(String args[]){
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("max sub array = " + maxSub(a));

    }
    static int maxSub(int a[]){
        int current = 0;
        int max = 0;
        int i;
        int size = a.length;
        for(i=0;i<size;i++){
            current = current + a[i];
            if(current > max){
                max = current;
            }
            if(current < 0){
                current = 0;
            }
        }
    }
    
}
