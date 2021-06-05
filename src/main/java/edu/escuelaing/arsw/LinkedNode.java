package edu.escuelaing.arsw;

public class LinkedNode<E> {
    private E node;
    private LinkedNode<E> next;
    
    /**
     * Create the node given an element and set the next one to the node as null
     * @param element
     */
    public LinkedNode(E element) {
        this.node = element;
        this.next= null;

    }
    /**
     * return the element from which the node is made
     * @return the element from which the node is made
     */
    public E getNode() {
        return this.node;
    }

    /**
     * sets the value of the node given an element
     * @param node
     */    
    public void setNode(E node) {
        this.node = node;
    }
    /**
     * return the node following a previously established one
     * @return the node following a previously established one
     */
    public LinkedNode<E> getNext() {
        return this.next;
    }
    /**
     * Sets the value of the next node based on the incoming node
     * @param next the node that will be set as the following
     */
    public void setNext(LinkedNode<E> next) {
        this.next = next;
    }
    
}