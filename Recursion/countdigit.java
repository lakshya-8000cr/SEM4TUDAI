public class countdigit {

    public static int cnt(int n){
        if(n==0) return 0;

        return 1 + cnt(n/10);
    }
    public static void main(String[] args){
        int n  = 12345;
        
        System.out.print(cnt(n));
    }
}
