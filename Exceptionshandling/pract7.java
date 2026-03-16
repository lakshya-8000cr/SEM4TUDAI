package Exceptionshandling;
import java.util.*;
public class pract7 {
    public static void main(String[] args){
         try{
            int a = 1;
            int b = 0;
            int ans = a / b;

            System.out.println(ans);
         }
         catch(ArithmeticException e){
            System.out.println("error hai ");
         }
         finally{
            System.out.println("Finally Pura Code Execute Ho Gaya");
         }
    }
}
