/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Iterator;

/**
 *
 * @author mzijlstra
 */
public class LinkedList<T> implements Iterable<T> {
    private Node<T> first;
    
    public void append(T data) {
        if (first == null) {
            first = new Node(data);
        } else {
            Node<T> current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node<T> current = first;
        while (current != null) {
            sb.append(current.data);
            sb.append(" ");
            current = current.next;
        }
        sb.append(" ]");
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }
    
    public class Node<T> {
        private T data;
        private Node<T> next;
        
        public Node(T data) {
            this.data = data;
        }
    }
    
    public class LinkedListIterator implements Iterator<T>{
        private Node<T> current = null;
        
        public boolean hasNext() {
            if (current == null && first != null) {
                return true;
            }
            return current.next != null;
        }
        
        public T next() {
            if (current == null && first != null) {
                current = first;
            } else {
                current = current.next;
            }
            return current.data;
        }
        
        public void remove() {
            
        }
    }
}
