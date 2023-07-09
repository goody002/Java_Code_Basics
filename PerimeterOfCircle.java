import java.util.Scanner;

//package BASIC.java;

public class PerimeterOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF THE CIRCLE : ");
        double r = sc.nextDouble();
        double ar = 2*3.14*r ;
        System.out.println("THE AREA IS : " + " " + ar);
    }
    
}
