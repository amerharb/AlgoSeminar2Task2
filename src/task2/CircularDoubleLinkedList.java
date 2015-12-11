package task2;

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

        Node<E> prev;
        E item;
        Node<E> next;

        Node(Node<E> prev, E element, Node<E> next)
        {
            this.prev = prev;
            this.item = element;
            this.next = next;
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
            curNode.next.prev = newNode;
            curNode.next = newNode;
            curNode = newNode;
        }
        size++;
    }

    public E remove()
    {
        if (curNode != null) {
            Node<E> delNode;
            if (curNode.next == curNode) { //then its the last item in list
                delNode = curNode;
                curNode = null;
                size = 0;
            } else {
                curNode.prev.next = curNode.next;
                curNode.next.prev = curNode.prev;
                delNode = curNode;
                curNode = curNode.next;
                size--;
            }
            return delNode.item;

        } else {
            return null;
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
