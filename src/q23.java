//question 23
class Node {
    int data;
    Node left, right;
    Node(int value) {
        data = value;
        left = right = null;
    }
}

 class BST {

    public static Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.data) root.left = insert(root.left, value);
        else if (value > root.data) root.right = insert(root.right, value);
        return root;
    }

    public static Node search(Node root, int key) {
        if (root == null || root.data == key) return root;
        if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    public static Node minValueNode(Node node) {
        Node current = node;
        while (current != null && current.left != null) current = current.left;
        return current;
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null) return root;
        if (key < root.data) root.left = deleteNode(root.left, key);
        else if (key > root.data) root.right = deleteNode(root.right, key);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        Node root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);

        System.out.print("Inorder traversal: ");
        inorder(root);

        System.out.println("\nDeleting 20");
        root = deleteNode(root, 20);
        inorder(root);

        System.out.print("\nSearching 40: ");
        Node found = search(root, 40);
        if (found != null) System.out.println("Found");
        else System.out.println("Not Found");
    }
}
