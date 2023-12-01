package LinkedList_Implementation

class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LLImplementation
{
    Node head = null;

    //method to add node to LL
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

    // Method to display the linked list
    public void displayLL()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class LinkedList {

    public static void main(String[] args)
    {
        LLImplementation LL = new LLImplementation();
        LL.addNode(56);
        LL.addNode(30);
        LL.addNode(70);

        //Display LL
        LL.displayLL();

    }
}
