import java.util.*;
public class pract1{
    public static void main(String[] args){
       ArrayList<Integer> list = new ArrayList<>();
       int n = 6;
       for(int i=0; i<n;i++){
        list.add(i);
       }

       for(int x : list){
        System.out.print(x + " ");
       }

       System.out.print(list.get(4));
       System.out.println(list.size());

       if(list.contains(5)){
        System.out.print(true);
       }

       list.remove(3);
              for(int x : list){
        System.out.print(x + " ");
       }
       
    } 
}