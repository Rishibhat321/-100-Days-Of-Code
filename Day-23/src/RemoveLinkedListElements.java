import java.util.*;

class ListNode{
    ListNode next;
    int val;

    ListNode(int val){
        this.val = val;
    }

}

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {

        if(head==null){
            return null;
        }

        if(head.next==null && head.val==val){
            return head.next;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;

        while(curr!=null)
        {
            if(curr.val!=val && temp==null){
                temp = curr;
                prev= curr;
                curr=curr.next;

            }

            else if(curr.val==val){
                curr=curr.next;
            }

            else{
                prev.next = curr;
                prev = prev.next;
                curr=curr.next;
            }

        }

        if(temp==null){
            return null;
        }

        prev.next=null;

        return temp;

    }

    public static ArrayList<Integer> printNode(ListNode res){

        ArrayList<Integer> list = new ArrayList<Integer>();

        ListNode c = res;

        while(c!=null){
            list.add(c.val);

            c = c.next;
        }

        return list;

    }

    public static void main(String[] args) {

        ListNode head= new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;

        ListNode res = removeElements(head, val);

        ArrayList<Integer> l = printNode(res);

        System.out.println(l);


    }
}