package lesson29.homework;

public class RubberList {
    private int size = 0;
    private Node first;
    private Node last;

    private int findIndex;

    public int size() {
        return size;
    }

    public Integer get(int idx) {
       Node findNode = findByIndex(idx);
       if (findNode != null) {
           return findNode.item;
       }
       return null;
    }

    public void add(int value) {
        if (size == 0) {
            first = new Node(null, value, null);
        } else if (size == 1) {
            last = new Node(first, value, null);
            first.next = last;
        } else {
            Node newLast = new Node(last, value, null);
            last.next = newLast;
            last = newLast;
        }
        size++;
    }

    public void add(int value, int idx) {
        // TODO
    }

    public void remove(int idx) {
        // if we want to remove 1st element
        if (idx == 0) {
            if (size == 1) {
                first = null;
            } else {
                Node newFirst = first.next;
                newFirst.prev = null;
                first = newFirst;
            }
            size--;
            // if we want to remove last element
        } else if (idx == size - 1) {
            Node newLast = last.prev;
            newLast.next = null;
            last = newLast;
            size--;
            // if we want to delete some middle element
        } else {
            Node findNote = findByIndex(idx);
            if (findNote == null) {
                return;
            }
            Node nodeA = findNote.prev;
            Node nodeC = findNote.next;
            nodeA.next = nodeC;
            nodeC.prev = nodeA;
            findNote.next = null;
            findNote.prev = null;
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (size > 0) {
            sb.append(first.item);
        }
        if (size > 1) {
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                sb.append(", ").append(cursor.item);
            }
        }
        return sb.append("]").toString();
    }

    private Node findByIndex(int idx) {
        if (idx == 0) {
            return first;
        }
        if (idx == size - 1) {
            return last;
        }
        findIndex = 0;
        Node cursor = first;
        while (cursor.next != null) {
            cursor = cursor.next;
            findIndex++;
            if (idx == findIndex) {
                return cursor;
            }
        }
        return null;
    }

    private Node findByValue(int value) {
        if (size == 0) {
            return null;
        }
        findIndex = 0;
        if (first.item == value) {
            return first;
        }
        Node cursor = first;
        while (cursor.next != null) {
            cursor = cursor.next;
            findIndex++;
            if (cursor.item == value) {
                return cursor;
            }
        }
        return null;

    }

    private static class Node {
        int item;
        Node next;
        Node prev;

        public Node(Node prev, int element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
