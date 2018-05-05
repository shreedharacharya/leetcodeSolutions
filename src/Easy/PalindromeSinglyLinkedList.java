package Easy;

public class PalindromeSinglyLinkedList {
    public static void main(String[] args) {


        new PalindromeSinglyLinkedList();

    }
    PalindromeSinglyLinkedList(){
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(2);
        ll.next.next = new ListNode(2);
        ll.next.next.next = new ListNode(1);
       System.out.println(isPalindrome(ll));

    };

    ListNode secondHalf;
    private  boolean isPalindrome(ListNode head) {
        boolean pal = true;
        ListNode fast_pointer = head;
        ListNode slow_pointer = head;
        ListNode midNode =null;
        ListNode prev_of_slow_pointer = head;
        if(head!= null && head.next!=null){
            while(fast_pointer!=null && fast_pointer.next != null){
                fast_pointer = fast_pointer.next.next;
                prev_of_slow_pointer = slow_pointer;
                slow_pointer = slow_pointer.next;

            }
            if(fast_pointer != null){
                midNode = slow_pointer;
                slow_pointer = slow_pointer.next;
            }
            prev_of_slow_pointer.next = null;
            secondHalf = slow_pointer;
            reverse();
            pal =  checkReverseEqual(secondHalf, head);
        }

        return pal;
    }

    private boolean checkReverseEqual(ListNode secondHalf, ListNode head) {
        ListNode temp1 = secondHalf;
        ListNode temp2 = head;
        while(temp1!=null && temp2!= null){
            if(temp1.val != temp2.val)return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1 == null && temp2 == null;
    }

    private void reverse() {
        ListNode next;
        ListNode prev =null;
        ListNode current = secondHalf;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
