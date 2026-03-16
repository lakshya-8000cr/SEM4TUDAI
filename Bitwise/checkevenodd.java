package Bitwise;
import java.util.*;

public class checkevenodd {
    public static void main(String[] args){
        int n = 10;
        if((n & 1) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<3; i++){
            set.add(i);
        }

        System.out.println(set.size());

    }
}
