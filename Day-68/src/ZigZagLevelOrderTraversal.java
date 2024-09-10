import java.util.*;
import java.util.Stack;

class TreeNode{
    TreeNode left;
    TreeNode right;

    int val;

    TreeNode(int val)
    {
        this.val = val;
    }
        }


public class ZigZagLevelOrderTraversal {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();

        if(root==null)
        {
            return res;
        }

        TreeNode curr = root;
        st1.push(curr);

        while(!st1.isEmpty() || !st2.isEmpty())
        {
            List<Integer> list = new ArrayList<>();

            while(!st1.isEmpty())
            {
                TreeNode temp = st1.pop();
                list.add(temp.val);

                if(temp.left!=null)
                {
                    st2.push(temp.left);
                }

                if(temp.right!=null)
                {
                    st2.push(temp.right);
                }
            }

            res.add(list);


            while(!st2.isEmpty())
            {
                list = new ArrayList<>();

                while(!st2.isEmpty())
                {
                    TreeNode temp1 = st2.pop();
                    list.add(temp1.val);

                    if(temp1.right!=null)
                    {
                        st1.push(temp1.right);
                    }

                    if(temp1.left!=null)
                    {
                        st1.push(temp1.left);
                    }

                }

                res.add(list);
            }


            if(st1.isEmpty() && st2.isEmpty())
            {
                return res;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> l = zigzagLevelOrder(root);

        System.out.println(l);

    }
}