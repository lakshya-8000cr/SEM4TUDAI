package SEM4TUDAI;

public class reverse {

    public static int reverse(int n , int r){
        if(n==0) return r;
        return reverse(n/10 , r*10 + n%10);
    } 
    public static void main(String[] args){
        int n = 1234;
        int r = 0;
        System.out.print(reverse(n,r));
    }
}
