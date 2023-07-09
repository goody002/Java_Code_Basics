//fibonacci series 0,1,1,2,3,5.....

import java.util.*;
class p{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, a=0,b=1,next, i;
        System.out.println("Enter the number of terms : ");
        n = sc.nextInt();
        for(i=0;i<n;i++){
            if(i<=1){
                next=i;
            }
            else{
                next=a+b;
                a=b;
                b=next;
            }
            System.out.println(next);
        }
        
        
    }
}