
public class prac3 {
    public static void number(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        number(n-1);
    }
    public static void number1(int x){
        if(x==6){
            return;
        }
        System.out.println(x);
        number1(x+1);
    }
    public static void main(String args[]){
        int n=5;
        int x = 1;
        number(n);
        number1(x);
    }
    
}
