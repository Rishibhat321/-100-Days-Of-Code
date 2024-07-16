import java.util.*;
class ListNode1{
    int val;
    ListNode1 next;

    ListNode1(int d){
        val = d;
        next = null;
    }
}
public class MergeNodesInBetweenZeros {

    public  static ListNode1 mergeNodes(ListNode1 head) {

        if(head==null){
            return null;
        }

        if(head.next==null && head.val!=0){
            return head;
        }

        if(head.next==null && head.val==0){
            return null;
        }


        ListNode1 curr = head;
        int d = 0;

        ListNode1 prev = new ListNode1(-1);
        ListNode1 c = prev;

        while(curr!=null){
            if(curr.val!=0){
                d += curr.val;
            }
            else if(curr.val==0 && d!=0){
                ListNode1 temp = new ListNode1(d);
                prev.next=temp;
                prev=prev.next;
                d=0;
            }

            curr=curr.next;
        }

        c = c.next;

        return c;

    }
    public static void main(String[] args) {

        ListNode1 node = new ListNode1(0);
        node.next = new ListNode1(3);
        node.next.next  =new ListNode1(1);
        node.next.next.next = new ListNode1(0);
        node.next.next.next.next = new ListNode1(4);
        node.next.next.next.next.next = new ListNode1(5);
        node.next.next.next.next.next.next = new ListNode1(2);
        node.next.next.next.next.next.next.next = new ListNode1(0);


        ListNode1 res = mergeNodes(node);

        ListNode1 prev = res;

        while(prev!=null){
            System.out.print(prev.val + " ");
            prev = prev.next;
        }

    }
}