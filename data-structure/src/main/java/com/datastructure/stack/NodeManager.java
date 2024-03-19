package com.datastructure.stack;

public class NodeManager {
    Node top;

    public NodeManager() {
        this.top = null;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.linkNode(top);
        top = node;
    }

    public void pop() {
        top = top.getNextNode();
    }

    public int peek() {
        return top.getDate();
    }


}
