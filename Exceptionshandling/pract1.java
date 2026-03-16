// package Exceptionhandling

public class pract1{
    public static void main(String[] args){
        try{
            int a = 10;
            int b = 0;
            int ans = a / b;
            System.out.println("New Exception");
        }

        catch(ArithmeticException e){
            System.out.println("Cannot Divide By Zero");
        }
    }
}