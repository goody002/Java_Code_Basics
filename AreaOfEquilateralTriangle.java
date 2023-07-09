import java.util.Scanner;

//package BASIC.java;

public class AreaOfEquilateralTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of one side S : ");
        double s = sc.nextDouble();
        //double a = Math.sqrt(3/4);
        double ar = (Math.sqrt(3)/4)*(s*s);
        double peri = 3*s;
        System.out.println("THE AREA OF EQUILATERAL TRIANGLE : " + " " + ar );
        System.out.println("THE PERIMETER OF EQUILATERAL TRIANGLE : " + " " + peri );
    }
    
}
