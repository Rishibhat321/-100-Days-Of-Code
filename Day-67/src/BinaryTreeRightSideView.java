import java.util.*;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val)
    {
        this.val = val;
    }
}

public class BinaryTreeRightSideView {

    public static List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(root==null)
        {
            return list;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int count=0;

        q.offer(root);

        while(!q.isEmpty())
        {
            count = q.size();

            for(int i=0;i<count;i++)
            {
                TreeNode curr = q.poll();

                if(i==0)
                {
                    list.add(curr.val);
                }

                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }

                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }
            }
        }

        return list;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> res = rightSideView(root);

        System.out.println(res);

    }
}