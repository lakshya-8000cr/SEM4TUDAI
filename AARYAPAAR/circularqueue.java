package AARYAPAAR;

/*
QUESTION:
Implement a circular queue using array with operations:
1. enqueue(int data)
2. dequeue()

Conditions:
- Print "Queue Full" when full
- Return -1 when empty

Test Case:
QueueArray q = new QueueArray();
q.enqueue(10);
q.enqueue(20);
q.dequeue();
*/

class circularqueue {

    int SIZE = 4;
    int front = -1;
    int rear = -1;
    int[] queue = new int[SIZE];

    void enqueue(int data) {

        if((rear + 1) % SIZE==front){
            System.out.println("Queue is full");
        }

        if(front==-1){
            front = 0;
        }
        else{
            rear = (rear + 1) % SIZE;
        }

        queue[rear] = data;
    }

    int dequeue() {

        if(front==-1){
            return -1;
        }

        int val = queue[front];
        
        if(front==rear){
           front = rear = -1;
        }
        else{
            front = (front + 1 ) % SIZE;
        }

        return val;
    }
}