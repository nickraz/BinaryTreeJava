package main;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>(33, null);
        tree.add(5, 35, 1, 20, 4, 17, 31, 99, 18, 19);

        tree.print();
        tree.remove(33);
        tree.remove(17);

        tree.print();
        System.out.println(tree);
        System.out.println(tree.left());
        System.out.println(tree.left().left());
        System.out.println(tree.right().left());
    }
	
}