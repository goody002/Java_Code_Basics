import java.util.Scanner;

//package BASIC.java;

public class ALL_BASIC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER \n '1' FOR CIRCLE \n '2' FOR TRIANGLE \n '3' FOR RECTANGLE ");
        System.out.println(" '4' FOR ISOSCELES TRIANGLE \n '5' FOR PARALLELOGRAM \n '6' FOR RHOMBUS \n '7' FOR EQUILATERAL TRIANGLE ");
        System.out.println(" '8' FOR SQUARE \n '9' FOR CONE \n '10' FOR PRISM \n '11' FOR CYLINDER \n '12' FOR CUBE \n '13' FOR SPHERE ");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        switch(choice){
            //AREA AND PERIMETER OF CIRCLE
            case 1:
            System.out.println("ENTER THE RADIUS OF THE CIRCLE : ");
            double r = sc.nextDouble();
            System.out.println("AREA OF CIRCLE IS : " + (3.14*r*r));
            System.out.println("PERIMETER OF CIRCLE IS : " + (2*3.14*r));
            break;

            //AREA OF TRIANGLE
            case 2:
            System.out.println("ENTER THE HEIGHT OF THE TRIANGLE : ");
            double h = sc.nextDouble();
            System.out.println("Enter the base of the triangle : ");
            double b = sc.nextDouble();
            System.out.println("AREA OF TRIANGLE IS : "+ " " + ((h*b)/2));
            break;

            //AREA AND PERIMETR OF RECTANGLE 
            case 3:
            System.out.println("Enter the length of the rectangle : ");
            double l = sc.nextDouble();
            System.out.println("Enter the breadth of the Rectangle : ");
            double breadth = sc.nextDouble();
            System.out.println("AREA OF RECTANGLE : " + " " + (l*breadth));
            System.out.println("THE PERIMETER IS : " + " " + (2*(l+breadth)));
            break;

            //AREA OF ISOSCELES TRIANGLE
            case 4:
            System.out.println("ENTER THE BASE OF THE TRIANGLE");
            double base = sc.nextDouble();
            System.out.println("Enter the value of one of the same sides : ");
            double a = sc.nextDouble();
            System.out.println("AREA OF THE ISOSCELES TRIANGLE : " + " " + ((base/4)*Math.sqrt((4*a*a) - (base*base))));
            break;

            //AREA AND PERIMETER OF PARALLELOGRAM
            case 5:System.out.println("ENTER THE HEIGHT OF THE PARALLELOGRAM : ");
            double HEIGHT = sc.nextDouble();
            System.out.println("Enter the breadth of the parallelogram : ");
            double br = sc.nextDouble();
            System.out.println("AREA OF PARALLELOGRAM : " + " " + (HEIGHT * br));
            System.out.println("PERIMETER OF PARALLELOGRAM : " + " " +(2*(HEIGHT + br)));
            break;

            //AREA AND PERIMETER OF RHOMBUS
            case 6:System.out.println("ENTER THE VALUE OF DIAGONAL(d1) : ");
            double d1 = sc.nextDouble();
            System.out.println("ENTER THE VALUE OF DIAGONAL(d2) : ");
            double d2 = sc.nextDouble();
            System.out.println("AREA OF THE RHOMBUS : " + " " + ((d1*d2)/2));
            System.out.println("ENTER THE VALUE OF SIDE : ");
            double side = sc.nextDouble();
            System.out.println("PERIMETER OF RHOMBUS : " + " " + (4*side));
            break;

            //AREA AND PERIMETER OF EQUILATERAL TRIANGLE 
            case 7:
            System.out.println("Enter the value of one side S : ");
            double s = sc.nextDouble();
            System.out.println("THE AREA OF EQUILATERAL TRIANGLE : " + " " + ((Math.sqrt(3)/4)*(s*s)) );
            System.out.println("THE PERIMETER OF EQUILATERAL TRIANGLE : " + " " + (3*s));
            break;

            //AREA AND PEREIMETER OF SQUARE
            case 8:
            System.out.println("ENTER THE SIDE OF THE SQUARE : ");
            double side1 = sc.nextDouble();
            System.out.println("AREA OF SQUARE : " + " " + (side1*side1));
            System.out.println("PERIMETER OF SQUARE : " + (4*side1));
            break;

            //VOLUME OF CONE
            case 9:
            System.out.println("ENTER THE RADIUS OF THE CONE : ");
            double rad = sc.nextDouble();
            System.out.println("ENTER THE HEIGHT OF THE CONE : ");
            double H = sc.nextDouble();
            System.out.println("VOLUME OF CONE IS : " + " " + ((1/3)*3.14*rad*rad*H));
            break;

            //VOLUME OF PRISM
            case 10:
            break;

            //VOLUME OF CYLINDER AND TOTAL SURFACE AREA OF CYLINDER
            case 11:
            System.out.println("ENTER THE RADIUS OF THE cylinder : ");
            double r2 = sc.nextDouble();
            System.out.println("ENTER THE HEIGHT OF THE cylinder : ");
            double h2 = sc.nextDouble();
            System.out.println("VOLUME OF cylinder : " + " " + (3.14*r2*r2*h2));
            System.out.println("TOTAL SURFACE AREA OF CYLINDER  : " + " " + (2*3.14*r2*(r2+h2)));
            break;

            //VOLUME OF SPHERE
            case 12:
            System.out.println("ENTER THE RADIUS OF THE SPHERE : ");
            double r1 = sc.nextDouble();
            System.out.println("VOLUME OF SPHERE : " + " " + ((4/3)*r1*r1*r1));
            break;

            default:
            System.out.println("NOT AN ACCURATE OPTION !!!!!");

        }
    }
    
}
