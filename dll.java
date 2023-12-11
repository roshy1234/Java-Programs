import java.util.*;

class node {
    int data;
    node next;
    node prev;

    public node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    node head;
    node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
}

public class dll {
    static DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    public static void main(String args[]) {
        int c;
        while (true) {
            System.out.println("\n1.addend()\n2.delend()\n3.addfront()\n4.delfront()\n5.traverse()\n6.Exit\n");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the choice:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    addEnd();
                    break;
                case 2:
                    delEnd();
                    break;
                case 3:
                    addFront();
                    break;
                case 4:
                    delFront();
                    break;                    
                case 5:
                    traverse();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    private static void traverse() {
        node t = doublyLinkedList.head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println(); // Add a newline after printing the list
    }

    private static void addEnd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to insert:");
        int n = sc.nextInt();
        if (doublyLinkedList.head == null) {
            node newnode = new node(n);
            newnode.next = null;
            newnode.prev = null;
            doublyLinkedList.head = newnode;
            doublyLinkedList.tail = newnode;
        } else {
            node newnode = new node(n);
            newnode.next = null;
            newnode.prev = doublyLinkedList.tail;
            doublyLinkedList.tail.next = newnode;
            doublyLinkedList.tail = newnode;
        }
    }

    private static void delEnd() {
        if (doublyLinkedList.head == null) {
            System.out.println("The list is empty");
        } else if (doublyLinkedList.head == doublyLinkedList.tail) {
            node temp = doublyLinkedList.head;
            doublyLinkedList.head = null;
            doublyLinkedList.tail = null;
            System.out.println("The deleted element is " + temp.data);
        } else {
            System.out.println("The deleted element is " + doublyLinkedList.tail.data);
            doublyLinkedList.tail = doublyLinkedList.tail.prev;
            doublyLinkedList.tail.next = null;
        }
    }
    
    private static void delFront() {
        if (doublyLinkedList.head == null) {
            System.out.println("The list is empty");
           }
        else if (doublyLinkedList.head == doublyLinkedList.tail) {
            node temp = doublyLinkedList.head;
            doublyLinkedList.head = null;
            doublyLinkedList.tail = null;
            System.out.println("The deleted element is " + temp.data);
            }
        else {
            node temp = doublyLinkedList.head;
            doublyLinkedList.head = doublyLinkedList.head.next;
            doublyLinkedList.head.prev = null;
            System.out.println("The deleted element is " + temp.data);            
            }
           }
           
     private static void addFront() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to insert:");
        int n = sc.nextInt();
        node newnode = new node(n);
        if (doublyLinkedList.head == null) {
            newnode.next = null;
            newnode.prev = null;
            doublyLinkedList.head = newnode;
            doublyLinkedList.tail = newnode;
        } 
        else {
            newnode.prev = null;
            newnode.next = doublyLinkedList.head;
            doublyLinkedList.head.prev = newnode;
            doublyLinkedList.head = newnode;
        }
      }
    }
       
            
       
