//question 17
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

 class SinglyLinkedList {
    static Node head = null;
    static Scanner sc = new Scanner(System.in);

    public static void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public static void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public static void deleteAtStart() {
        if (head == null) return;
        head = head.next;
    }

    public static void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    public static void deleteAtPosition(int pos) {
        if (head == null || pos == 1) {
            deleteAtStart();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void search(int data) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Found at position " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Not found");
    }

    public static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        while (true) {
            System.out.print("\nMenu:\n1.Insert Start\n2.Insert End\n3.Insert At Position\n4.Delete Start\n5.Delete End\n6.Delete At Position\n7.Search\n8.Display\n9.Exit\nChoice: ");
            int choice = sc.nextInt();
            int data, pos;
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    insertAtStart(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter data and position: ");
                    data = sc.nextInt();
                    pos = sc.nextInt();
                    insertAtPosition(data, pos);
                    break;
                case 4:
                    deleteAtStart();
                    break;
                case 5:
                    deleteAtEnd();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    deleteAtPosition(pos);
                    break;
                case 7:
                    System.out.print("Enter data to search: ");
                    data = sc.nextInt();
                    search(data);
                    break;
                case 8:
                    display();
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }
}
