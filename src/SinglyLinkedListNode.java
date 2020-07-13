import java.util.Objects;

public class SinglyLinkedListNode {

    public SinglyLinkedListNode() {

    }

    public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
        this.data = data;
        this.next = next;

    }

    int data;
    SinglyLinkedListNode next;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SinglyLinkedListNode)) return false;
        SinglyLinkedListNode that = (SinglyLinkedListNode) o;
        return data == that.data &&
                Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}
