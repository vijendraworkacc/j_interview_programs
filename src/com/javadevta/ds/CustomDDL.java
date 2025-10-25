package com.javadevta.ds;

/*
 * Doubly Linked List - Core Features and Functionalities
 *
 * 1. Node Structure
 *    - Each node should have:
 *        → data: stores the actual value
 *        → prev: pointer/reference to the previous node
 *        → next: pointer/reference to the next node
 *
 * 2. Initialization
 *    - A DoublyLinkedList class should have:
 *        → head: reference to the first node
 *        → tail: reference to the last node
 *        → size: (optional) keeps track of the number of elements
 *
 * 3. Insertion Operations
 *    - insertAtBeginning(data): add a new node at the start
 *    - insertAtEnd(data): add a new node at the end
 *    - insertAtPosition(pos, data): add a node at a given position (index-based)
 *
 * 4. Deletion Operations
 *    - deleteFromBeginning(): remove the first node
 *    - deleteFromEnd(): remove the last node
 *    - deleteByValue(value): remove the first node that matches the value
 *    - deleteAtPosition(pos): remove a node at a specific index
 *
 * 5. Traversal / Display
 *    - displayForward(): print all elements from head to tail
 *    - displayBackward(): print all elements from tail to head
 *
 * 6. Search
 *    - search(value): find whether a specific value exists in the list
 *    - return the node reference or index if found, otherwise null / -1
 *
 * 7. Update
 *    - updateValue(oldValue, newValue): find and replace a value in the list
 *
 * 8. Utility Functions
 *    - getLength(): return the number of nodes in the list
 *    - isEmpty(): return true if the list has no elements
 *    - clear(): remove all nodes from the list
 *
 * 9. Optional Advanced Features
 *    - reverseList(): reverse the entire list by adjusting next and prev pointers
 *    - convertToList(): return a standard Java List of all node values
 *    - insertSorted(value): insert elements maintaining sorted order
 *
 * These features together make a complete implementation of a Doubly Linked List.
 */
class DoublyLinkedList {
    static class Node {
        Node prev;
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private Integer size = 0;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    // 1. insertAtBeginning(data): add a new node at the start
    // Replacing head with the new node
    public void insertAtBeginning(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // 2. insertAtEnd(data): add a new node at the end
    // Replacing tail with the new node
    public void insertAtEnd(Integer data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // 3. insertAtPosition(pos, data): add a node at a given position (index-based)
    public void insertAtPosition(Integer pos, Integer data) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid positions");
        }
        if (pos == 0) {
            insertAtBeginning(data);
            return;
        }
        if (pos.equals(size)) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node before = head;
        for (int i = 0; i < pos; i++) {
            before = before.next;
        }
        Node after = before.prev;
        after.next = newNode;
        newNode.prev = after;
        newNode.next = before;
        before.prev = newNode;

        size++;
    }

    // 1. displayForward(): print all elements from head to tail using recursion
    public void displayForward(Node current) {
        if (current != null) {
            System.out.print(current.data + " <-> ");
            displayForward(current.next);
        } else {
            System.out.print("NULL");
        }
    }

    // 2. displayBackward(): print all elements from tail to head using recursion
    public void displayBackward(Node current) {
        if (current != null) {
            System.out.print(current.data + " <-> ");
            displayBackward(current.prev);
        } else {
            System.out.print("NULL");
        }
    }

    // 1. deleteFromBeginning(): remove the first node
    public void deleteFromBeginning() {
        if (head == null) {
            return;
        }
        if (head != null && head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.next.prev = null;
        size--;
    }

    // 2. deleteFromEnd(): remove the last node
    public void deleteFromEnd() {
        if (tail == null) {
            return;
        }
        if (tail != null && tail == head) {
            tail = head = null;
            return;
        }
        tail.prev.next = null;
        tail.prev = null;
        size--;
    }

    // 3. deleteByValue(value): remove the first node that matches the value
    public void deleteByValue(Integer data) {
        if (head == null) {
            return;
        }
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (!current.data.equals(data)) {
                current = current.next;
            } else {
                Node a = current.prev;
                Node b = current;
                Node c = current.next;
                a.next = c;
                c.prev = a;
                b.next = b.prev = null;
                return;
            }
        }
    }

    // 4. deleteAtPosition(pos): remove a node at a specific index
    public void deleteAtPosition(Integer pos) {
        Node current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        deleteByValue(current.data);
    }

    // 1. search(value): find whether a specific value exists in the list
    public boolean search(Integer data) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data.equals(data)) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    // 1. reverse(): reverse the entire list by adjusting next and prev pointers
    public void reverse() {
        Node current = head;
        for (int i = 0; i < size; i++) {
            Node nextReverse = current.next;
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = nextReverse;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }
}

public class CustomDDL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.displayForward(list.getHead());   // Output: List (head → tail): 10 <-> 20 <-> 30 <-> 40
        boolean search = list.search(60);
        System.out.println("\nElement found: " + search);
//        list.deleteAtPosition(2);
//        System.out.println();
//        list.displayForward(list.getHead());
        list.reverse();
        System.out.println();
        list.displayForward(list.getHead());
    }
}
