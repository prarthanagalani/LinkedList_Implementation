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
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    // Method to insert a new node with data after a given node
    public void InsertNodeAfterGivenNode(int prev_data,int data)
    {
        Node newnode = new Node(data);

        Node temp = head;

        while(temp != null) {
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

    //delete head
    public void deleteHead()
    {
        Node temp = head->next;

        head = temp;
    }


}

public class LinkedList {

    public static void main(String[] args)
    {
        LLImplementation LL = new LLImplementation();
        LL.addNode(56);
        LL.addNode(70);

        // Use Case4
        LL.InsertNodeAfterGivenNode(56,30)

        // Use Case 5
        LL.deleteHead();
        LL.displayLL();

    }
}
