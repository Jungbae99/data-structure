package com.datastructure.stack;

public class Node {

    private int item;
    private Node node;

    public Node(int item) {
        this.item = item;
        this.node = null;
    }

    protected void linkNode(Node node) {
        this.node = node;
    }

    protected int getDate() {
        return this.item;
    }

    protected Node getNextNode() {
        return this.node;
    }


}
