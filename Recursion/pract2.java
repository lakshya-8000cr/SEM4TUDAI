package Recursion;

public class pract2 {
    static void coin(int n , String ans){
        if(n==0){
            System.out.print(ans);
            return ;
        }

        coin(n-1 , ans + "H");
        coin(n-1 ,ans + "T");
    }

    public static void main(String[] args){
        coin(2,"");
    }
}
