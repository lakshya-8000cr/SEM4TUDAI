import java.util.*;
public class pract2 {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n<0){
                throw new Exception("n");
            }

            System.out.println("Square is : " + n*n);
        }

        catch(Exception e){
            if(e.getMessage().equals("n")){
                System.out.println("Number is Negative");
            }
        }
    }
}
