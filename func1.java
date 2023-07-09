import java.util.*;
//package BASIC.java.BASIC;
//returnType FunctionName(type arg1, type arg2...)
public class func1 {
    public static void printMyName(String name){
        System.out.print("NAME IS :" + name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name); //call kiya function ko

    }
    
}
