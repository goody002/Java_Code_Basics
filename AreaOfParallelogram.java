import java.util.Scanner;

//package BASIC.java;

public class AreaOfParallelogram {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE HEIGHT OF THE PARALLELOGRAM : ");
double h = sc.nextDouble();
System.out.println("Enter the breadth of the parallelogram : ");
double b = sc.nextDouble();
double ar = h * b ;
double peri = 2*(h + b);
System.out.println("AREA OF PARALLELOGRAM : " + " " + ar);
System.out.println("PERIMETER OF PARALLELOGRAM : " + " " + peri);


    }
    
}
