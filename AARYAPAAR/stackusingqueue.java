package AARYAPAAR;

import java.util.*;

/*
QUESTION:
Implement Stack using two queues.
*/

class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x){
        q2.add(x);
        
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop(){

        if(q1.isEmpty()){
            return -1;
        }

        return q1.poll();
    }
}
