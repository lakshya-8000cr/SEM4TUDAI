package HashMap;
import java.util.*;

public class ques1 {
    public static void main(String[] args){
      HashMap<Integer , Integer> map = new HashMap<>();
      int[] arr =  {1,2,3,4,4};
      for(int i=0; i<arr.length; i++){
          int num = arr[i];
          if(map.containsKey(num)){
            map.put(num , map.get(num)+1);
          }
          else{
            map.put(num , 1);
          }
      }

      for(Map.Entry<Integer , Integer> e1 : map.entrySet()){
          int key = e1.getKey();
          int val = e1.getValue();
          if(val>1){
            System.out.println(key);
            return ;
          }
      }
    }
}
