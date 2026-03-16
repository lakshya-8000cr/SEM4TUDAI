import java.util.*;
public class pract4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        try{
            char c = ch.charAt(0);
            if(Character.isDigit(c)){
               throw new Exception("s");
            }

            System.out.println(ch);
        }
        catch(Exception e){
            if(e.getMessage().equals("s")){
                System.out.println("This is not a character");
            }
        }
    }
}
