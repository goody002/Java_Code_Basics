import java.util.Scanner;

//package BASIC.java;

public class AreaOfRhombus {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE VALUE OF DIAGONAL(d1) : ");
double d1 = sc.nextDouble();
System.out.println("ENTER THE VALUE OF DIAGONAL(d2) : ");
double d2 = sc.nextDouble();
double ar = (d1*d2)/2;
System.out.println("AREA OF THE RHOMBUS : " + " " + ar);

    }
    
}
