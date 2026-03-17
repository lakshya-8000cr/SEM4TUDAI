package Recursion;
import java.util.*;

public class pract4 {
    public static void main(String[] args){
        int n = 6;
        int[] arr = {1,2,4,5,6};

        int sum = 0;
        for(int i=0;i<=n; i++){
            sum += i;
        }

        int s = 0;
        for(int i=0; i<arr.length; i++){
            s += arr[i];
        }

        int ans = sum - s;
        System.out.println(ans);
    }
}
