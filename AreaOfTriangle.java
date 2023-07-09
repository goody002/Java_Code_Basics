//package BASIC.java;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE HEIGHT OF THE TRIANGLE : ");
double h = sc.nextDouble();
System.out.println("Enter the base of the triangle : ");
double b = sc.nextDouble();
double ar = (h*b)/2;
System.out.println("AREA OF TRIANGLE IS : "+ " " + ar);


    }
}
