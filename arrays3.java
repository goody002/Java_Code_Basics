import java.util.*;
public class arrays3 {
    public static void main(String args[]){
        int size,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();
        System.out.println("the values are : ");
        int number[] = new int[size];
        for(i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        System.out.println("The final array");
        for(i=0;i<size;i++){
            System.out.println(number[i]);
        }
        Arrays.sort(number); //inbuilt sort function for sorting
        System.out.println("the min element : " + number[0]);
        System.out.println("the maximum element: " + number[size - 1]);
    }
    
    
}
