import java.util.HashSet;
import java.util.Set;

public class CycleDetection {

    /*A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
    Complete the function provided for you in your editor. It has one parameter: a pointer to a Node object
    named that points to the head of a linked list. Your function must return a boolean denoting
    whether or not there is a cycle in the list. If there is a cycle, return true; otherwise, return false.
    Note: If the list is empty,Head will be null.
    Input Format
    Our hidden code checker passes the appropriate argument to your function. You are not responsible for
    reading any input from stdin.
            Constraints
    Output Format
    If the list contains a cycle, your function must return true. If the list does not contain a cycle, it must
    return false. The binary integer corresponding to the boolean value returned by your function is printed to
    stdout by our hidden code checker*/

    public static void main(String... args) {

        /*SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode();
        singlyLinkedListNode.data = 1;
        singlyLinkedListNode.next = null;
        System.out.println(hasCycle(singlyLinkedListNode));*/
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode();
        SinglyLinkedListNode singlyLinkedListNode2 = new SinglyLinkedListNode();
        SinglyLinkedListNode singlyLinkedListNode3 = new SinglyLinkedListNode();

        singlyLinkedListNode2.data = 2;
        singlyLinkedListNode2.next = singlyLinkedListNode3;
        singlyLinkedListNode3.data = 3;
        singlyLinkedListNode3.next = singlyLinkedListNode2;

        singlyLinkedListNode.data = 1;
        singlyLinkedListNode.next = singlyLinkedListNode2;

        System.out.println(hasCycle(singlyLinkedListNode));

    }

    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        Set<SinglyLinkedListNode> check = new HashSet<>();

        if (head.next == null) {
            return false;
        } else {
            while (current.next != null) {
                System.out.println(current.data);
                //Checking if its present in set before add will return false
                if (!check.add(current.next)) {
                    return true;
                }
                current = current.next;

            }

            return false;

        }
    }
}
