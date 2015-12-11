/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Amer
 */
public class CircularDoubleLinkedList<E>
{

    private Node<E> curNode;
    private int size = 0;

    public int size()
    {
        return size;
    }

    private static class Node<E>
    {

        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next)
        {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void add(E item)
    {
        if (curNode == null) { //which mean the list is empty and this is the first item
            curNode = new Node(null, item, null);
            curNode.next = curNode;
            curNode.prev = curNode;
        } else {
            Node<E> newNode = new Node(curNode, item, curNode.next);
            curNode.next = newNode;
            curNode.next.prev = newNode;
            curNode = newNode;
        }
        size++;
    }

    public boolean remove()
    {
        if (curNode != null) {
            if (curNode.next == curNode) { //then its the last item in list
                curNode = null;
                size = 0;
            } else {
                curNode.prev.next = curNode.next;
                curNode.next.prev = curNode.prev;
                curNode = curNode.next;
                size--;
            }
            return true;

        } else {
            return false;
        }
    }

    public E next()
    {
        curNode = curNode.next;
        return curNode.item;
    }

    public E prev()
    {
        curNode = curNode.prev;
        return curNode.item;
    }

    public E peek()
    {
        return curNode.item;
    }
}
