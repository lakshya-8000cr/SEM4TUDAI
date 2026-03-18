package Recursion;
import java.util.*;
public class pract5 {
    public static  void fibo(int a , int b , int n){
        if(n==0)return ;
        fibo(b ,a+b, n-1);
        System.out.println(a + " ");
    }
    public static void main(String[] args){
        fibo(0,1,7);
    }
}
