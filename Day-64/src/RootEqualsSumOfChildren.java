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

public class RootEqualsSumOfChildren {

    public static boolean checkTree(TreeNode root) {

        if(root==null)
        {
            return true;
        }

        if(root.left==null && root.right==null)
        {
            return true;
        }

        if((root.left.val==0 && root.right.val==0) && root.val!=0)
        {
            return false;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.offer(root);
        int sum = 0;

        while(!q.isEmpty())
        {
            sum = 0;
            TreeNode curr = q.poll();

            if(curr.right!=null && curr.left!=null)
            {
                sum += curr.left.val;
                sum += curr.right.val;

                q.offer(curr.left);
                q.offer(curr.right);

            }

            else{
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }

                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
            }

            if(sum!=curr.val && sum!=0)
            {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

   /*     TreeNode root = new TreeNode(100);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);  */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        boolean res = checkTree(root);

        System.out.println(res);

    }
}