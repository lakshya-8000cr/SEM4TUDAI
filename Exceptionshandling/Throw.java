package Exceptionshandling;
// this keyword "Throw"  manually exception throw karta hai for any condition 
public class Throw {
    public static void main(String[] args){
      int age = 15;
      if(age<20){
        throw new ArithmeticException("Not Eligible for this");
      }
      else{
        System.out.println("Kuch bhi likh diya");
      }
    }
}
