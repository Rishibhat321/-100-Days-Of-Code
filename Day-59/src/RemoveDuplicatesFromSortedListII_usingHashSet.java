import java.util.LinkedList;
import java.util.HashSet;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class RemoveDuplicatesFromSortedListII_usingHashSet {

    public static ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode prev = null;
        ListNode curr = null;

        ListNode node = head;

        ListNode curr1 = head;

        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> d = new HashSet<Integer>();

        while(curr1!=null)
        {
            if(set.contains(curr1.val)){
                d.add(curr1.val);
            }

            set.add(curr1.val);

            curr1 = curr1.next;
        }

        while(node!=null)
        {
            if(!d.contains(node.val))
            {
                if(prev==null)
                {
                    prev = node;
                    curr = node;
                }

                else{
                    curr.next = node;
                    curr = curr.next;
                }

                node = node.next;
            }

            else{
                node = node.next;
            }
        }

        if(prev==null)
        {
            return null;
        }

        curr.next = null;

        return prev;


    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next =new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode res = deleteDuplicates(head);

        while(res!=null)
        {
            System.out.print(res.val + " ");

            res = res.next;
        }


    }
}