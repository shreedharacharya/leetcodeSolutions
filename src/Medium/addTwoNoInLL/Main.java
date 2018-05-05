package Medium.addTwoNoInLL;

public class Main {

    public static void main(String[] args) {

        new Main();

    }

    Main() {

        ListNode list = new ListNode(8);

        list.next = new ListNode(7);
        list.next.next = new ListNode(5);
        list.next.next.next = new ListNode(9);
        list.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next = new ListNode(6);
        System.out.print("First List is ");
        printList(list);


        ListNode list1 = new ListNode(9);
        list1.next = new ListNode(8);
        list1.next.next = new ListNode(4);
        System.out.print("Second List is ");
        printList(list1);


        ListNode result = addTwoNumbers(list, list1);
        System.out.print("Resultant List is ");
        printList(result);


    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        int sum = 0;
        while (l1 != null || l2 != null) {

            int x = l1 == null ? 0 : l1.value;
            int y = l2 == null ? 0 : l2.value;

            sum = sum + x + y;
            int rem = sum % 10;
            sum = sum / 10;
            currentNode.next = new ListNode(rem);
            currentNode = currentNode.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }

        if (sum > 0) {
            currentNode.next = new ListNode(sum);
        }
        return dummyHead.next;
    }
}
