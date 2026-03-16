package Exceptionshandling;

import java.util.*;

// in this question we will see how to make custom exceptions and use them efficiently

class MyException extends Exception{
    MyException(String msg){
      super(msg);
    }
}

public class pract6 {

    // static void checkAge(int age) throws MyException{
    //    if(age<18){
    //        throw new MyException("Age Must Be 18 +");
    //    }
    //    System.out.print("Eligible");
    // }

    public static void main(String[] args){
      try{
        int a = 10;
        int b = 0;
        int ans = a*b;

        if(ans==0){
          throw new MyException("s");
        }

        System.out.println(ans);
      }
      catch(MyException e){
          if(e.getMessage().equals("s")){
            System.out.println("Cannot be divide by 0");
          }
      }
    }   
}