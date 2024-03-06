public class KWLinkedList<E>{
    private static class Node<E> {

        /**
         * The data value.
         */
        private E data;
        /**
         * The link to the next node.
         */
        private Node<E> next = null;
        /**
         * The link to the previous node.
         */
        private Node<E> prev = null;
        private int size = 0;


        private Node(E dataItem) {
            data = dataItem;
        }
    }

    private Node<E> head = null;
    /** A reference to the end of the list. */
    private Node<E> tail = null;
    /** The size of the list. */
    private int size = 0;

    public void addFirst(E item) {
        Node<E> n = new Node<E>(item);
        //head.prev=n;
        n.next=head;
        head=n;

    }
    public void addLast(E item) {
        Node<E> n = new Node<E>(item);
        tail.next = n;
        n.prev = tail;
        tail = n;

    }
}