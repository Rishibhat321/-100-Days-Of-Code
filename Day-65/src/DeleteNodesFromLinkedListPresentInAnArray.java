import java.util.HashSet;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val)
    {
        this.val = val;
    }
}

public class DeleteNodesFromLinkedListPresentInAnArray {

    public static ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> list = new HashSet<Integer>();
        int d=0;

        for(int ele:nums)
        {
            list.add(ele);
        }

        if(head==null)
        {
            return null;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode dummy = null;

        while(curr!=null)
        {
            d = curr.val;

            if(!list.contains(d) && prev==null)
            {
                prev = curr;
                dummy = curr;
                curr= curr.next;
            }

            else if(list.contains(d))
            {
                curr = curr.next;
            }
            else {
                prev.next = curr;
                prev = prev.next;
                curr= curr.next;
            }
        }

        prev.next=null;

        return dummy;

    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode res = modifiedList(nums, head);

        ListNode c = res;

        while(c!=null)
        {
            System.out.print(c.val + " ");
            c = c.next;
        }

    }
}