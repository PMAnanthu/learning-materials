package test;

import jdk.jshell.EvalException;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        TreeNode four=new TreeNode(4,null,null);
        TreeNode six=new TreeNode(6,null,null);
        TreeNode seven=new TreeNode(7,null,null);
        TreeNode five=new TreeNode(5,six,seven);
        TreeNode two=new TreeNode(2,four,five);
        TreeNode nine=new TreeNode(9,null,null);
        TreeNode eight=new TreeNode(8,nine,null);
        TreeNode three=new TreeNode(3,null,eight);
        TreeNode root=new TreeNode(1,two,three);
        Solution solution=new Solution();
        //solution.postOrderTraversal(root).forEach(System.out::println);
        solution.levelOrder(root).forEach(System.out::println);
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> res=new ArrayList<>();
            for(int i = 0;i<size;i++) {
                TreeNode node = queue.poll();
                if(node!=null) {
                    res.add(node.value);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            result.add(res);
        }
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.value);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return result;
    }
    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode current=root;
        while (current!=null || !stack.isEmpty()){
           while (current!=null){
               stack.push(current);
               current=current.left;
           }

           current=stack.pop();
           result.add(current.value);

            current = current.right;
        }
        return result;
    }

    public List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        Stack<Integer> stackResult=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            stackResult.push(node.value);
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null) {
                stack.push(node.right);
            }
        }
        while (!stackResult.isEmpty()){
            result.add(stackResult.pop());
        }
        return result;
    }

}
