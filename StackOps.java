class StackOps {
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.Push(67);
        obj.Push(7);
        obj.Push(6);
        obj.Push(13);
        obj.Push(12);
        System.out.println("Before poping");
        obj.display();
        obj.Pop();
        System.out.println("After poping");
        obj.display();
    }

}

class Stack {
    int top = -1;
    int[] ar = new int[5];

    boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (top < ar.length) {
            return true;

        } else {
            return false;
        }
    }

    public void Push(int v) {
      
            if (!isFull()) {
                top++;
                ar[top] = v;
            }
            else{
                System.out.println("stack is overflow......");
            }
        
    }

    int Pop() {
        if (!isEmpty()) {
            int x = ar[top];
            top--;
            return x;
        } else {
            System.out.println("stack is underflow");
            return -1;
        }
    }

    void display() {
        for (int i = top; i > -1; i--) {
            System.out.println(ar[i]);
        }
    }
}