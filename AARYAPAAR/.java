package AARYAPAAR;

import java.util.*;

/*
QUESTION:
Implement Queue using two stacks.

Operations:
enqueue(x)
dequeue()

Approach: Costly dequeue
*/

class QueueUsingStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

     void enqueue(int x){
        s1.push(x);
     }

     int dequeue(){
        if(s2.isEmpty() && s1.isEmpty()){
            return -1;
        }

        if(s2.isEmpty()){
            while(!s1.isEmpty()){
              s2.push(s1.pop());
            }
        }

        return s2.pop();
     }

}
