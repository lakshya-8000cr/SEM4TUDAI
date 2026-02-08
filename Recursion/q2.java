package Recursion;

public class q2 {

    public static int cnt = 0;
    public static void print(){
        if(cnt==5){
            return ;
        }

        System.out.println("Lakshya Chauhan");
        cnt++;
        print();
    }
    public static void main(String[] args){
        print();
    }
}
