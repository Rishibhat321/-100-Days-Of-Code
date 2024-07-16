import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int d){
        val = d;
        next=null;
    }
}
public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = new int[2];

        if(head==null || head.next==null ||head.next.next==null){
            arr[0]= -1;
            arr[1] = -1;
            return arr;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        int c=1;
        int d=0;

        ListNode curr=head;
        ListNode prev=curr;

        curr=curr.next;

        while(curr.next!=null){
            c++;
            if(curr.val>curr.next.val && curr.val>prev.val){
                d=c;
                list.add(d);
            }
            else if(curr.val<curr.next.val && curr.val<prev.val){
                d=c;
                list.add(d);
            }

            prev = curr;
            curr=curr.next;
        }

        if(list.isEmpty()){
            arr[0] = -1;
            arr[1] = -1;

            return arr;
        }

        if(list.size()==1){
            arr[0] = -1;
            arr[1] = -1;

            return arr;
        }

        Collections.sort(list);

        Integer min = Collections.min(list);
        Integer max = Collections.max(list);

        arr[1] = max-min;

        int res= Integer.MAX_VALUE;
        int diff=0;

        for (int i = 0; i < list.size()-1; i++) {
            diff = list.get(i+1) - list.get(i);

            res = Math.min(res,diff);
        }


        arr[0] = res;

        return arr;

    }
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);

        int[] res = nodesBetweenCriticalPoints(head);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}