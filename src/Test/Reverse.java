package Test;

public class Reverse {

    ListNode listNode;
    ListNode nextt;

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        new Reverse();

    }

    Reverse() {
        //0->1->2->3->4->5->6
        listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
       // nextt = listNode.next.next.next.next;
        listNode.next.next.next.next.next = new ListNode(5);
      //  listNode.next.next.next.next.next.next = new ListNode(6);

//       ListNode head = reverse(listNode, nextt);
//        while(head!=null){
//            System.out.print(head.data+"->");
//            head = head.next;
//        }

        ListNode head =  rearrangeLastN(listNode,3);
        print(head);
    }

    private void print(ListNode head) {
        ListNode dummyhead = head;
        int count =0;
        while(head!=null){
            System.out.print(head.data+"->");
            head = head.next;
            count++;
      }
      head = dummyhead;
    }

    public ListNode reverse(ListNode pre, ListNode next) {
        ListNode last = pre.next;
        ListNode curr = last.next;

        while (curr != next) {
            System.out.println("Last= " + last.data + "  current= " + curr.data + " Pre= " + pre.data + " NEXt= " + next.data);
            System.out.println("***********");
            last.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
            curr = last.next;
            System.out.println("Last= " + last.data + "  current= " + curr.data + " Pre= " + pre.data + " NEXt= " + next.data);
        }

        return pre;
    }


    ListNode rearrangeLastN(ListNode l, int n) {
        if(l==null || n==0) return l;
        ListNode temp = l;
        int len=1;
        while(temp.next!=null){
            temp= temp.next;
            len++;
        }
        temp.next = l;
        n= n%len;
        for(int i=0; i<(len-n); i++){
            temp= temp.next;
        }

        l= temp.next;
        temp.next=null;
        return l;
    }
}
