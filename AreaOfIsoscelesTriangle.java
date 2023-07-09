import java.util.Scanner;

//package BASIC.java;
//[ b/4√((4*a*a)-(b*b)) ]
public class AreaOfIsoscelesTriangle {
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE BASE OF THE TRIANGLE");
double b = sc.nextDouble();
System.out.println("Enter the value of one of the same sides : ");
double a = sc.nextDouble();
double ar = (b/4)*Math.sqrt((4*a*a) - (b*b));
System.out.println("AREA OF THE ISOSCELES TRIANGLE : " + " " + ar);

    }
    
}
