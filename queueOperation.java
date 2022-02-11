 class queueOperation {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(56);
        q.enqueue(56);
        q.enqueue(56);
        q.enqueue(56);
        System.out.println("queue after enque");
        q.Display();
        q.Dequeue();
        System.out.println("queue after dequeue");
        q.Display();

        
    }

}

class Queue {
    int rear = -1;
    int front = -1;
    int ar[] = new int[6];

    boolean isFull() {
        if (rear == ar.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (rear == -1 && front == rear) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(int v) {
        if (!isFull()) {
            rear++;
            ar[rear] = v;

        } else {
            System.out.println("Queue is Full...");
        }
    }

    int Dequeue() {
        if (!isEmpty()) {
            int x = ar[front];
            front++;
            return x;
        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }

    void Display()
    {
        for (int i = 0; i < rear; i++) {
            System.out.println(ar[i]);
        }
    }
}