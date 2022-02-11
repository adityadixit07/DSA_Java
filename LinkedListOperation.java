class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedListOperation {
    public static void main(String[] args) {
        Node head = new Node(23);
        Node second = new Node(24);
        Node third = new Node(26);
        Node fourth = new Node(27);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        printLL(head);
        insert(25, 3, head);
        System.out.println("list after insertion");

        printLL(head);
        delete(5, head);
        System.out.println("List after deletion");
        printLL(head);
        Deletelast(head);
        System.out.println("list after last deletion..");
        printLL(head);
    }
    public static void printLL(Node head) {
        while (head != null) {
            System.out.println(head.data);

            head = head.next;
        }
    }
    public static void Deletelast(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.gc();
    }
    public static void insert(int x, int pos, Node head) {
        Node newNode = new Node(25);
        int count = 1;
        Node temp = head;
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }
        Node nextNode = temp.next;
        temp.next = newNode;
        newNode.next = nextNode;
    }
    public static void delete(int pos, Node head) {
        Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
       // Node deletedNode = temp.next;
        Node nextNode = temp.next.next;
        temp.next = nextNode;
    }
}
