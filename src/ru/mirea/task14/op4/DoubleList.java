package ru.mirea.task14.op4;

public class DoubleList {
    Node head;
    class Node {
        int data;
        Node prev;
        Node next;
        Node(int d) { data = d; }
    }

    public void push(int new_data)
    {
        Node new_Node = new Node(new_data);

        new_Node.next = head;
        new_Node.prev = null;

        if (head != null)
            head.prev = new_Node;

        head = new_Node;
    }

    public void printlist(Node node)
    {
        Node last = null;

        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }

        System.out.println();
    }

    void deleteNode(Node del)
    {

        // Base case
        if (head == null || del == null) {
            return;
        }

        if (head == del) {
            head = del.next;
        }

        if (del.next != null) {
            del.next.prev = del.prev;
        }

        if (del.prev != null) {
            del.prev.next = del.next;
        }

        return;
    }

    public static void main(String[] args)
    {
        // Start with the empty list
        DoubleList dll = new DoubleList();

        // Insert 2. So linked list becomes 2->NULL
        dll.push(2);

        // Insert 4. So linked list becomes 4->2->NULL
        dll.push(4);

        // Insert 8. So linked list becomes 8->4->2->NULL
        dll.push(8);

        // Insert 10. So linked list becomes
        // 10->8->4->2->NULL
        dll.push(10);

        System.out.print("Original Linked list ");
        dll.printlist(dll.head);


        dll.deleteNode(dll.head); /*delete first node*/
        dll.deleteNode(dll.head.next); /*delete middle node*/
        dll.deleteNode(dll.head.next); /*delete last node*/

        System.out.print(
                "\nModified Linked list ");
        dll.printlist(dll.head);
    }
}