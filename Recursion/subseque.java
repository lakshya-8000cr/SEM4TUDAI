public class subseque {

    public static void sub(String str , String ans ){
        if(str.length()==0){
            System.out.print(ans);
            return ;
        }

        char ch = str.charAt(0);
        String rest = str.substring(1);

        // include;
        sub(rest , ans + ch);
        
        //exclude;
        sub(rest , ans);
    }
    public static void main(String[] args){
        sub("abc" , "");
    }
}
