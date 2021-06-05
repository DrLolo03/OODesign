package edu.escuelaing.arsw;

import java.io.Serializable;
import java.util.*;

public class LinkedList<E> implements Serializable, Cloneable, Deque<E>, List<E>{

    private LinkedNode<E> head;
    private LinkedNode<E> end;
    private int size;
    
    public LinkedList(){
        this.head=null;
        this.end=null;
        this.size=0;
    }
    public LinkedNode<E> getHead() {
        return this.head;
    }
    public LinkedNode<E> getEnd() {
        return this.end;
    }
    /**
     * return an iterator over the content of the list in the order set by the nodes
     * @return an iterator over the content of the list in the order set by the nodes
     */
    public Iterator<E> iterator() {
        return new Iterator<E>(){
            LinkedNode<E> first = head; 
            
            public boolean hasNext() {
                return first != null;
            }

            public E next() {
                if (hasNext()) {
                    E node = first.getNode();
                    first = first.getNext();
                    return node;
                }
                return null;
            }

        };
    }
    /**
     * Appends the specified element to the LinkeList setting the new node to be the next to previous last node
     * If the LinkedList is empty it creates the nodes corresponding to head and end of the list  
     * @param  e element to be appended to the list
     */
    public boolean add(E e) {
        if (isEmpty()){
            head = new LinkedNode<E>(e);
            end = head;
            head.setNext(end);
        }
        else{
            LinkedNode<E> NewNode = new LinkedNode<E>(e);
            end.setNext(NewNode);
            end= NewNode;
        }
        size+=1;
    return false;
    }
    /**
     * return the size of the linkedList
     * @return the size of the linkedList
     */
    public int size() {
        return size;
    }

    /**
     * return a boolean that indicates if the list is empty
     * @return a boolean that indicates if the list is empty
     */
    public boolean isEmpty() {
        return size==0;
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear() {
        // TODO Auto-generated method stub
        
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public E set(int index, E element) {
        // TODO Auto-generated method stub
        return null;
    }

    public void add(int index, E element) {
        // TODO Auto-generated method stub
        
    }

    public E remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public ListIterator<E> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public ListIterator<E> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public void addFirst(E e) {
        // TODO Auto-generated method stub
        
    }

    public void addLast(E e) {
        // TODO Auto-generated method stub
        
    }

    public boolean offerFirst(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean offerLast(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    public E removeFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    public E removeLast() {
        // TODO Auto-generated method stub
        return null;
    }

    public E pollFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    public E pollLast() {
        // TODO Auto-generated method stub
        return null;
    }

    public E getFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    public E getLast() {
        // TODO Auto-generated method stub
        return null;
    }

    public E peekFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    public E peekLast() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean removeFirstOccurrence(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean removeLastOccurrence(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

 

    public boolean offer(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    public E remove() {
        // TODO Auto-generated method stub
        return null;
    }

    public E poll() {
        // TODO Auto-generated method stub
        return null;
    }

    public E element() {
        // TODO Auto-generated method stub
        return null;
    }

    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean addAll(Collection<? extends E> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public void push(E e) {
        // TODO Auto-generated method stub
        
    }

    public E pop() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }


    public Iterator<E> descendingIterator() {
        // TODO Auto-generated method stub
        return null;
    }  
}


    
