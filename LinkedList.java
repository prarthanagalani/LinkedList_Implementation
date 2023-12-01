public class LinkedList {

    public static void main(String[] args) {
        LLImplementation LL = new LLImplementation();

        // Use case 10
        LL.addNodeinSorted(30);

        LL.addNodeinSorted(40);

        LL.addNodeinSorted(25);

        LL.displayLL();

    }
}

class Node implements Comparable<Node> {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public int compareTo(Node other) {
        return this.data - other.data;
    }
}

class LLImplementation {
    Node head = null;

    // method to add node to LL
    public void addNode(int data) {
        Node newnode = new Node(data);

        // If we encounter first node
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newnode;

        }
    }

    // method to add node in sorted order
    public void addNodeinSorted(int data) {
        Node newnode = new Node(data);

        // if we are adding first node
        if (head == null) {
            newnode.next = head;
            head = newnode;
            return;
        }

        // data of node is less than head
        if (newnode.compareTo(head) < 0) {
            newnode.next = head;
            head = newnode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            if (newnode.compareTo(temp) > 0) {
                newnode.next = temp;
                return;
            }

            temp = temp.next;
        }
        // adding node at tail
        temp.next = newnode;

    }

    // Method to display the linked list
    public void displayLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    // Method to insert a new node with data after a given node
    public void InsertNodeAfterGivenNode(int prev_data, int data) {
        Node newnode = new Node(data);

        Node temp = head;

        while (temp != null) {
            // when we find node with prev_data
            if (temp.data == prev_data) {
                Node next = temp.next;
                temp.next = newnode;
                newnode.next = next;
                break;
            }

            temp = temp.next;
        }
    }

    // delete head
    public void deleteHead() {
        Node temp = head.next;
        head = temp;
    }

    // Pop last node
    public void deleteLast() {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

    }

    // search node with given value

    public Node search(int data) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == data)
                return temp;
            temp = temp.next;
        }

        return null;
    }

    // method to delete node from anywhere in the LL
    public void deleteNode(int data) {
        Node temp = head;

        Node prev = null;

        while (temp != null) {
            if (temp.data == data) {
                prev.next = temp.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }
    }

    // calculate size of LL
    public int size() {
        int count = 0;
        Node temp = head;

        // Count the number of nodes in the linked list
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

}
