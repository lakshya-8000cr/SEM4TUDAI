package Exceptionshandling;
import java.util.*;

public class arrayoutofbound {
    public static void main(String[] args){
        try{
            int n = 5;
            int[] arr = new int[n];
            System.out.println(arr[5]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound hai : ");
        }

        catch(Exception e){
            System.out.println("General Exception");
        }
    }
}
