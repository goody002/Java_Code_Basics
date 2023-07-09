import java.util.Scanner;

//package BASIC.java;

public class AreaPerimeterOfRectangle {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of the rectangle : ");
double l = sc.nextDouble();
System.out.println("Enter the breadth of the Rectangle : ");
double b = sc.nextDouble();
double ar = l*b;
System.out.println("AREA OF RECTANGLE : " + " " + ar);

double peri = 2*(l+b);
System.out.println("THE PERIMETER IS : " + " " + peri);

    }
    
}
