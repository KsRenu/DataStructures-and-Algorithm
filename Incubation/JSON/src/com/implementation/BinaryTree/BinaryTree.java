package com.implementation.BinaryTree;


class Node{
    int key;
    Node left,right;

    public Node(int key) {
        this.key = key;
    }
}
public class BinaryTree {
    Node root;

    int key;

    public BinaryTree(int key) {
        this.root = new Node(key) ;
    }

    public BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
    }


}
