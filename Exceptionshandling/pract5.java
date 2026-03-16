import java.util.*;
public class pract5 {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            int wid = sc.nextInt();
            int balance = sc.nextInt();
            if(wid>balance){
                throw new Exception("s");
            }

            if(balance<=0){
                throw new Exception("d");
            }

            System.out.println("Balance : " + balance + " Withdraw : " + wid + " Remaining balance : "+ (balance - wid));
        }

        catch(Exception e){
            if(e.getMessage().equals("s")){
                System.out.println("widraw greater than balance");
            }
            if(e.getMessage().equals("d")){
                System.out.println("Not enough balance");
            }
            // System.out.println(e.getMessage());
        }
    }
}
