import java.util.*;
public class pract3 {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();

            if(name.length()<4){
                throw new Exception("s");
            }

            System.out.println("Valid Username");
        }

        catch(Exception e){
            if(e.getMessage().equals("s")){
                System.out.println("Too Short");
            }
        }
    }
}
