package Test;

public class CustomDoublyLinkedList {

    Node head;
    Node tail;
    int size = 0;


    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.printData();
        System.out.println();
        dll.add(6, 88);
        dll.removeFirst();
        dll.removeLast();
        dll.remove(6);
        dll.printData();
    }

    private void printData() {
        Node dummyHead = head;
        while (head != tail) {
            System.out.print(head.data + "  ");
            head = head.next;
        }
        if (head != null)
            System.out.print(head.data + "  ");
        head = dummyHead;
    }

    private void addFirst(int data) {

        Node currNode = new Node(data);
        currNode.next = head;
        currNode.prev = null;
        if (head != null) {
            head.prev = currNode;
        } else {
            tail = currNode;
        }

        head = currNode;
        size++;

    }

    private void addLast(int data) {
        Node currNode = new Node(data);
        if (tail != null) {
            tail.next = currNode;
        } else {
            head = currNode;
        }
        currNode.prev = tail;
        currNode.next = null;
        tail = currNode;
        size++;
    }


    private void add(int index, int data) {
        if (index > size || index < 0) throw new RuntimeException("Invalid index");
        Node currNode = new Node(data);
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        int count = 1;
        Node dummyHead = head;
        while (head.next != null) {
            head = head.next;
            if (count == index) break;
            count++;
        }

        head.prev.next = currNode;
        currNode.prev = head.prev;
        currNode.next = head;
        head.prev = currNode;
        head = dummyHead;
        size++;


    }

    private boolean remove(int data) {
        if (size < 1) throw new RuntimeException("EmptyList");
        Node dummyHead = head;
        if (data == head.data) {
            removeFirst();
            return true;
        }
        while (head.next != null) {
            if (head.next.data == data) {
                head.next = head.next.next;
                if (head.next != null) {
                    head.next.prev = head;
                } else {
                    tail = head;
                }

                head = dummyHead;
                size--;
                return true;
            }
            head = head.next;
        }

        if (head.data == data) {
            removeLast();
            head = dummyHead;
            return true;
        }
        head = dummyHead;
        return false;
    }

    private void removeFirst() {
        if (size < 1) throw new RuntimeException("NO item exists");
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    private void removeLast() {
        if (size < 1) throw new RuntimeException("NO item exists");
        tail = tail.prev;
        if (tail == null) {
            head = null;
        }
        size--;
    }
}
