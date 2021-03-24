package com.company.DataStructure.BinarySearchTree;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Stack;

public class BinarySearchTree <T extends Comparable<T>>{
    private int nodeCount = 0;

    private Node root = null;

    private class Node {
        T data;
        Node left, right;
        public Node (Node left, Node right, T e){
            this.data = e;
            this.left = left;
            this.right = right;
        }
    }

    // 二叉树是否为空
    public boolean isEmpty() {
        return size() == 0;
    }

    // 获取二叉树有多少个节点
    public int size(){
        return nodeCount;
    }

    // 向这个二叉树插入一个元素
    public boolean add(T e){
        if(contains(e)){
            return false;
        }else {
            root = add(root, e);
            nodeCount ++;
            return true;
        }
    }

    private Node add(Node node, T e){
        if (node == null){
            node = new Node(null, null, e);
        }else {
            if (e.compareTo(node.data) < 0){
                node.left = add(node.left, e);
            }else{
                node.right = add(node.right, e);
            }
        }
        return node;
    }

    public boolean remove(T e){
        if (contains(e)){
            root = remove(root, e);
            nodeCount --;
            return true;
        }
        return false;
    }

    public boolean contains(T e){
        return contains(root, e);
    }

    private boolean contains(Node node, T e){
        if (node == null) return false;
        int cmp = e.compareTo(node.data);
        if (cmp < 0) return contains(node.left, e);
        else if (cmp > 0) return contains(node.right, e);
        else return true;
    }

    private Node remove(Node node, T e){
        if (node == null) return null;
        int cmp = e.compareTo(node.data);
        if (cmp < 0){
            node.left = remove(node.left, e);
        }else if (cmp > 0) {
            node.right = remove(node.right, e);
        }else {
            if (node.left == null){
                Node rightChild = node.right;
                node.data = null;
                node = null;
                return rightChild;
            }else if (node.right == null){
                Node leftChild = node.left;
                node.data = null;
                node = null;
                return leftChild;
            }else {
                Node tmp = findMin(node.right);
                node.right = remove(node.right, tmp.data);
            }
        }
        return node;
    }

    private Node findMin(Node node){
        while (node.left != null) node = node.left;
        return node;
    }

    private Node findMax(Node node){
        while (node.right != null) node = node.right;
        return node;
    }

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if (node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public Iterator<T> traverse(TreeTraversalOrder order){
        switch (order){
            case PRE_ORDER:
                return preOrderTraversal();
            case IN_ORDER:
                return inOrderTraversal();
            case POST_ORDER:
                return postOrderTraversal();
            case LEVEL_ORDER:
                return levelOrderTraversal();
            default:
                return null;
        }
    }

    private Iterator<T> preOrderTraversal(){
        final int expectedNodeCount = nodeCount;
        final Stack<Node> stack = new Stack<>();
        stack.push(root);

        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (expectedNodeCount != nodeCount) throw new ConcurrentModificationException();
                return root != null && !stack.isEmpty();
            }

            @Override
            public T next() {
                if (expectedNodeCount != nodeCount) throw new ConcurrentModificationException();
                Node node = stack.pop();
                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);
                return node.data;
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    private Iterator<T> inOrderTraversal() {
        final int expectedNodeCount = nodeCount;
        final Stack<Node> stack = new Stack<>();
        stack.push(root);

        return new Iterator<T>() {
            Node trav = root;

            @Override
            public boolean hasNext() {
                if (expectedNodeCount != nodeCount) throw new ConcurrentModificationException();
                return root != null && !stack.isEmpty();
            }

            @Override
            public T next() {
                if (expectedNodeCount != nodeCount) throw new ConcurrentModificationException();
                while (trav != null && trav.left != null) {
                    stack.push(trav.left);
                    trav = trav.left;
                }

                Node node = stack.pop();

                if (node.right != null) {
                    stack.push(node.right);
                    trav = node.right;
                }
                return node.data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    // Returns as iterator to traverse the tree in post order
    private Iterator<T> postOrderTraversal() {
        final int expectedNodeCount = nodeCount;
        final Stack<Node> stack1 = new Stack<>();
        final Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            if (node != null) {
                stack2.push(node);
                if (node.left != null) stack1.push(node.left);
                if (node.right != null) stack1.push(node.right);
            }
        }
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (expectedNodeCount != nodeCount) throw new ConcurrentModificationException();
                return root != null && !stack2.isEmpty();
            }

            @Override
            public T next() {
                if (expectedNodeCount != nodeCount) throw new ConcurrentModificationException();
                return stack2.pop().data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

        // Returns as iterator to traverse the tree in level order
        private Iterator<T> levelOrderTraversal() {
            final int expectedNodeCount = nodeCount;
            final java.util.Queue<Node> queue = new java.util.LinkedList<>();
            queue.offer(root);

            return new java.util.Iterator<T>() {
                @Override
                public boolean hasNext() {
                    if (expectedNodeCount != nodeCount) throw new java.util.ConcurrentModificationException();
                    return root != null && !queue.isEmpty();
                }

                @Override
                public T next() {
                    if (expectedNodeCount != nodeCount) throw new java.util.ConcurrentModificationException();
                    Node node = queue.poll();
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                    return node.data;
                }

                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
    }
}
