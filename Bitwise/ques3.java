package Bitwise;

public class ques3 {
    public static void main(String[] args){
        int a  = 7;

        int one = 0;
        int zer = 0;

        while(a>0){
            int rem = a % 2;
            if(rem==1){
                one++;
            }
            else{
                zer++;
            }

            a = a / 2;
        }

        System.out.println(one + " " + zer);
    }
}
