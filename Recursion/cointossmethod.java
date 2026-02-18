public class cointossmethod {

    public static void cointoss(int n  , String str){
        if(n==0){
            System.out.println(str);
            return ;
        }

        cointoss(n-1,str + "H");
        cointoss(n-1,str + "T");
    }
    public static void main(String[] args){
        cointoss(2,"");
    }
}
