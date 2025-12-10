//question 18
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

 class DoublyLinkedList {
    static Node head = null;

    public static void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        insertEnd(10);
        insertEnd(20);
        insertEnd(30);
        display();
    }
}
