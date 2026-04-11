package AARYAPAAR;
import java.util.*;

// next greater element in circular array ;

public class ques3 {
    public static void main(String[] args){
        int[] arr = {1 , 2  , 7 ,4  , 5 , 6 };

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                   System.out.print(arr[j]+" ");
                   break;
                }
                else{
                    System.out.print("-1"+" ");
                    break;
                }
            }

            if(arr.length-1==i){
               for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+"");
                    break;
                }
               }
            }
        }
    }
}
