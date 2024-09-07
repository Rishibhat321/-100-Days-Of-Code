import java.util.*;
import java.util.LinkedList;

class TreeNode{
    TreeNode right;
    TreeNode left;
    int val;

    TreeNode(int val)
    {
        this.val = val;
    }
}


public class FindLargestValueInEachTreeRow {

    public static List<Integer> largestValues(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(root==null)
        {
            return list;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.offer(root);
        int count = 0;
        int max = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;

        while(!q.isEmpty())
        {
            count = q.size();

            for(int i=0;i<count;i++)
            {
                TreeNode curr = q.poll();
                max = curr.val;
                res = Math.max(res,max);

                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }

                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
            }

            list.add(res);

            res = Integer.MIN_VALUE;
            max = Integer.MIN_VALUE;
        }

        return list;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(9);
        root.left.right =  new TreeNode(3);
        root.left.left = new TreeNode(5);

        List<Integer> res = largestValues(root);

        System.out.println(res);


    }
}