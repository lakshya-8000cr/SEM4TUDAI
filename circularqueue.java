class CircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;


    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }


    boolean isEmpty() {
        if(front==-1 || front>rear){
            return true;
        }

        return false;
    }

    boolean isFull() {
        if((rear+1)%capacity==front){
            return true;
        }
        return false;
    }


    void enqueue(int value) {
        if(isFull()){
            return;
        }

        if(front>rear || front==-1){
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear+1) % capacity;
        }

        arr[++rear] = value;
    }

  
    int dequeue() {
        if(isEmpty()){
            return -1;
        }

        int val = arr[front];
        
        if(front==rear){
            front = -1;
            rear = -1;
        }
        front = (front + 1)%capacity;
        return val;
    }


    int peek() {
        int val = arr[front];
        return val;
    }

}

