
import java.util.*;
public class pract2 {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);

        for(int x : set){
            System.out.print(x + " ");
        }

        if(set.contains(2)){
     System.out.print(true);
        }
    }
}
