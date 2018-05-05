package Test;

public class CustomSinglyLinkedList {
    Node head = null;
    int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        CustomSinglyLinkedList linkedList = new CustomSinglyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(0, 0);
        linkedList.add(4, 5);
        linkedList.add(6, 7);
        linkedList.add(3, 3);
        linkedList.remove(new Integer(5));
        linkedList.remove(3);
       // linkedList.remove(9);
        System.out.println(linkedList.remove(new Integer(90)));
        linkedList.printData();
    }

    private void printData(){
        Node dummyHead = head;
        while(head!= null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        head = dummyHead;
    }

    private void add(int data) {
        if (head == null) {
            AddFirstNode(data);
        } else {
            Node dummyHead = head;
            while (head.next != null) {
                head = head.next;
            }
            head.next = new Node(data);
            head = dummyHead;
            size++;
        }
    }


    private void add(int index, int data) {
        if (index > size || index<0) throw new RuntimeException("index is greater than size");
        if (head == null) AddFirstNode(data);
        else {

            Node dummyHead = head;
            Node current;
            if(index ==0){
                current = head;
                head = new Node(data);
                head.next = current;
                size++;
                return;
            }
            int count = 1;
            while (head.next != null) {
                if (count == index) break;
                head = head.next;
                count++;
            }
            current = head.next;
            head.next = new Node(data);
            head.next.next = current;
            head = dummyHead;
            size++;
        }
    }

    private boolean remove(Integer data) {

        if (size <= 0) return false;

        Node dummyHead = head;
        while (head.next != null) {
            if (head.next.data == data) {
                head.next = head.next.next;
                head = dummyHead;
                size--;
                return true;
            }
            head = head.next;
        }
        if (head.data == data) {
            head = null;
            size--;
            head = dummyHead;
            return true;
        }
        head = dummyHead;
        return false;

    }

    private int remove(int index) {
        if (index >= size() || index < 0) throw new RuntimeException("invalid index");

        Node dummyHead = head;
        int count = 1;
        int value;
        while (head.next != null) {
            if (count == index) {
                value = head.next.data;
                head.next = head.next.next;
                head = dummyHead;
                size--;
                return value;
            }
            head = head.next;
            count++;
        }
        value = head.data;
        head = null;
        head = dummyHead;
        size--;
        return value;

    }


    private void AddFirstNode(int data) {
        head = new Node(data);
        size++;
    }

    private int size() {
        return size;
    }
}
