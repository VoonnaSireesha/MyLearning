package practisePgrms;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    class Node{
        int data;
        Node left = null;
        Node right = null;
    }

    class Traversal{
        final static String INORDER = "inorder";
        final static String PREORDER = "preorder";
        final static String POSTORDER = "postorder";
    }

    private Node root = null;

    private Node add(Node node,int data){
        if(node == null){
            Node newNode = new Node();
            newNode.data = data;
            newNode.left = null;
            newNode.right = null;
            return newNode;
        }
        if(data < node.data)
            node.left = add(node.left,data);
        else
            node.right = add(node.right,data);
        return node;
    }

    public void add(int data){
        root = add(root,data);
    }

    private void inOrderTraversal(Node node, List<Integer> result){
        if(node == null) return;
        inOrderTraversal(node.left,result);
        result.add(node.data);
        inOrderTraversal(node.right,result);
    }

    private void preOrderTraversal(Node node, List<Integer> result){
        if(node == null) return;
        result.add(node.data);
        preOrderTraversal(node.left,result);
        preOrderTraversal(node.right,result);
    }

    private void postOrderTraversal(Node node, List<Integer> result){
        if(node == null) return;
        postOrderTraversal(node.left,result);
        postOrderTraversal(node.right,result);
        result.add(node.data);
    }

    public List<Integer> getData(String traversal){
        ArrayList<Integer> result = new ArrayList<>();
        if(traversal.equalsIgnoreCase(Traversal.INORDER))
            inOrderTraversal(root,result);
        else if(traversal.equalsIgnoreCase(Traversal.PREORDER))
            preOrderTraversal(root,result);
        else
            postOrderTraversal(root,result);
        return result;
    }

    public static void testBinaryTree(int[] input,String traversal){
        BinaryTree binaryTree = new BinaryTree();
        for (int i : input) {
            binaryTree.add(i);
        }
        List<Integer> output = binaryTree.getData(traversal);
        for (Integer i : output) {
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        //UTC02_01
        {
            int[] input = {60, 55, 100, 57, 107, 67, 45};
            testBinaryTree(input,Traversal.INORDER);
        }
        //UTC02_02
        {
            int[] input = {5,2,8,7,9,10};
            testBinaryTree(input,Traversal.INORDER);
        }
        //UTC02_03
        {
            int[] input = {60, 55, 100, 57,107,67,45};
            testBinaryTree(input,Traversal.POSTORDER);
        }
        //UTC02_04
        {
            int[] input = {60, 55, 100, 57,107,67,45};
            testBinaryTree(input,Traversal.PREORDER);
        }
    }
}
