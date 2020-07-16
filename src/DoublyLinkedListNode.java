import java.util.Objects;

public class DoublyLinkedListNode {

    public DoublyLinkedListNode(){

    }

    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DoublyLinkedListNode)) return false;
        DoublyLinkedListNode that = (DoublyLinkedListNode) o;
        return data == that.data &&
                Objects.equals(next, that.next) &&
                Objects.equals(prev, that.prev);
    }

}
