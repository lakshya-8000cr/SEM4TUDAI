package Recursion;

public class pract1 {

    static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n * fib(n-1);
    }
    public static void main(String[] args){
        System.out.println(fib(3));
    }
}
