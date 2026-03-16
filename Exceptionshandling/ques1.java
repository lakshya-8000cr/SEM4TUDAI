package Exceptionshandling;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args){
         try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt() ;
            int ans = a / b;

            System.out.println(ans);
            sc.close();
         }

         catch(ArithmeticException e){
            System.out.print("bbbbb");
            System.out.println("Divide by 0 is not allowed");
         }

         catch(Exception e){
            System.out.println("General Exception");
         }

        //  catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Index out of bound");
        //  }
    }
}



