package Test;

public class LinkedListCustom {

    Node head = null;
    int size;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LinkedListCustom linkedList = new LinkedListCustom();

        linkedList.test();
//        linkedList.addData(2);
//        linkedList.addData(4);
//        linkedList.addData(5);
//        linkedList.addData(6);
//        linkedList.addData(1, 3);
//       int a = linkedList.remove(3);
//       boolean b = linkedList.remove(new Integer(3));

       // linkedList.printData();

    }

    private  void test() {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        printData();

        System.out.println();
        Node temp = head;
        temp =temp.next.next;
       // temp.next.next.next= new Node(6);
       // temp.next.next.next.next= new Node(7);
        printData();
    }

    private boolean remove(Integer integer){
        //Node dumHead = head;
        Node curr = head;
        if(size <=0) throw  new RuntimeException("list is empty");
        if(size == 1 && curr.data==integer) {
            head = null;
            size--;
            return true;
        }
        while(curr.next != null){
            if(curr.next.data ==integer) {
                curr.next = curr.next.next;
                size--;
                return true;
            }
            curr = curr.next;
        }
        if(curr.data == integer){
            curr = null;
        }
        return false;
    }

    private int remove(int index) {
        if (index >= size || index<0) throw new RuntimeException("Invalid index");
        Node current = head;
        Node dummyHead = head;
        if(index==0){
            head = current.next;
            size--;
            return current.data;
        }
        int count = 1;

        while (head.next != null) {
            current = head.next;
            if (count == index) break;
            head = head.next;
            count++;
        }
        head.next = current.next;
        size--;
        head = dummyHead;
        return current.data;

    }

    private void printData() {
        Node temp = head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        head = temp;
    }

    private void addData(int data) {

        Node dummyHead = head;
        if (head == null) {
            head = new Node(data);
            size++;
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = new Node(data);
            size++;
            head = dummyHead;
        }

    }

    private void addData(int index, int data) {

        if (index > size || index<0) throw new RuntimeException("Index is larger then size");
        Node dummyHead = head;

        if (head == null) {
            head = new Node(data);
            size++;
        } else {

            if (index == 0) {
                head = new Node(data);
                head.next = dummyHead;
                return;
            }

            int count = 1;
            Node temp;

            while (head.next != null) {
                if (count == index) break;
                head = head.next;
                count++;
            }
            temp = head.next;
            head.next = new Node(data);
            head.next.next = temp;
            size++;
            head = dummyHead;
        }
    }

    private void addData() {
        //head = new Node(5);
      //  Node n1 = head.next = new Node(7);
        //Node n2 = n1.next = new Node(9);
       // Node n3 = n2.next = new Node(19);
    }

}
