package AARYAPAAR;

import java.util.*;

/*
QUESTION:
Given a queue of integers, modify it such that elements at even indices 
(0-based) are reversed using a stack, while others remain in same order.

Example:
Input:  [12, -1, -7, 8, -15, 30, 16, 28]
Output: [-7, -1, 12, 8, 16, 30, -15, 28]

Test Case:
Queue<Integer> q = new LinkedList<>(Arrays.asList(12, -1, -7, 8, -15, 30, 16, 28));
*/


class fliphalfqueue {
    
    // Function jahan aapko logic likhna hai
    static void flipHalfQueue(Queue<Integer> q) {
        if (q == null || q.isEmpty()) return;

       Stack<Integer> st = new Stack<>();

       int n = q.size();

       for(int i=0; i<n; i++){
          int val = q.poll();

          if(i % 2 == 0){
            st.push(val);
          }

          q.add(val);
       }

       for(int i=0; i<n; i++){
        int val = q.poll();

        if(i % 2 == 0){
            q.add(st.pop());
        }
        else{
            q.add(val);
        }
       }
    }

    public static void main(String[] args) {
        // Test Case
        Queue<Integer> q = new LinkedList<>(Arrays.asList(12, -1, -7, 8, -15, 30, 16, 28));

        System.out.println("Input Queue:  " + q);

        // Function Call
        flipHalfQueue(q);

        // Output Print
        System.out.println("Output Queue: " + q);
    }
}