package Exceptionshandling;

public class multiplecatchblock {
    public static void main(String[] args){
        try{
            int a = 10;
            int b = 0;

            try{
                int ans = a / b;
                System.out.println(ans);
            }

            catch(ArithmeticException e){
                System.out.println("Divide By Zero Not allowed");
            }
        }

        catch(Exception e){
            System.out.println("General Expression");
        }

        finally{
            System.out.println("Finally Executed");
        }
    }
}
