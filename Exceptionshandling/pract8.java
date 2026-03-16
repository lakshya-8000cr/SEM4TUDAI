package Exceptionshandling;

public class pract8 {
    public static void main(String[] args){
        try{
            int n = -9;
            if(n<0){
                throw new Exception("s");
            }

            System.out.println(n);
        }

        catch(Exception e){
            if(e.getMessage().equals("s")){
                System.out.println("Number is Negative");
            }
        }
    }
}
