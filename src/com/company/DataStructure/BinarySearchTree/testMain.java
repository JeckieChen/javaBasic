package com.company.DataStructure.BinarySearchTree;

public class testMain {
    public static void main(String[] args) {

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        System.out.println(binarySearchTree.add(2));
        System.out.println(binarySearchTree.add(3));
        System.out.println(binarySearchTree.add(4));
        System.out.println(binarySearchTree.add(5));
        System.out.println(binarySearchTree.add(3));
        System.out.println(binarySearchTree.add(1));
        System.out.println(binarySearchTree.height());

    }
}
