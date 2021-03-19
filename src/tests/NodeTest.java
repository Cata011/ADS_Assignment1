package tests;

import org.junit.jupiter.api.Assertions;
import stack.Node;

class NodeTest<T> {

    private Node<Integer> node;
    private int elm1;
    private int elm2;
    private int elm3;
    private int elm4;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.elm1 = 1;
        this.elm2 = 2;
        this.elm3 = 3;
        this.elm4 = 4;
        this.node = new Node<>(elm1);
    }

    @org.junit.jupiter.api.Test
    void setData() {
        Assertions.assertEquals(node.getData(), 1);
        node.setData(elm4);
        Assertions.assertEquals(node.getData(), 4);
    }

    @org.junit.jupiter.api.Test
    void setDataNull() {
        Assertions.assertEquals(node.getData(), 1);
        node.setData(null);
        Assertions.assertNull(node.getData());
    }

    @org.junit.jupiter.api.Test
    void getData() {
        Assertions.assertEquals(node.getData(),1);
        Assertions.assertNotEquals(node.getData(), 2);
    }

    @org.junit.jupiter.api.Test
    void setNext() {
        Node<Integer> otherNode = new Node<>(elm4);
        node.setNext(otherNode);
        Assertions.assertEquals(node.getNext().getData(), 4);
    }

    void setNextNull() {
        node.setNext(null);
        Assertions.assertNull(node.getNext().getData());
    }

    @org.junit.jupiter.api.Test
    void getNext() {
        Node<Integer> otherNode = new Node<>(elm3);
        node.setNext(otherNode);
        Assertions.assertEquals(node.getNext().getData(), 3);
    }
}