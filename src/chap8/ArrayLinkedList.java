package chap8;

public class ArrayLinkedList<E> {

    class Node<E> {
        private E data;
        private int next;
        private int dnext;

        void set(E data, int next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<E>[] n;
    private int size;
    private int max;
    private int head;
    private int crnt;
    private int deleted;
    private static final int NULL = -1;
}
