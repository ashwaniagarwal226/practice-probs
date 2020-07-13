import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MergePointTwoLinkedList {
    /*URL*/
    /*https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?h_r=next-challenge&h_v=zen*/


    /*Given pointers to the head nodes of linked lists that merge together at some point, find the Node where
    the two lists merge. It is guaranteed that the two head Nodes will be different, and neither will be NULL.
    In the diagram below, the two lists converge at Node x :
      [List #1] a--->b--->c
                    \
                     x--->y--->z--->NULL
                    /
         [List #2] p--->q

    Complete the int FindMergeNode(Node* headA, Node* headB) method so that it finds and returns the
    data value of the Node where the two lists merge.
    Input Format
    Do not read any input from stdin/console.
            The FindMergeNode(Node*,Node*) method has two parameters, and , which are the nonnull head Nodes of two separate linked lists that are guaranteed to converge.

      SOLN:-
      int FindMergeNode(Node headA, Node headB) {
    Node currentA = headA;
    Node currentB = headB;

    //Do till the two nodes are the same
    while(currentA != currentB){
        //If you reached the end of one list start at the beginning of the other one
        //currentA
        if(currentA.next == null){
            currentA = headB;
        }else{
            currentA = currentA.next;
        }
        //currentB
        if(currentB.next == null){
            currentB = headA;
        }else{
            currentB = currentB.next;
        }
    }
    return currentB.data;
}

*/
    public static void main(String... args) {

        SinglyLinkedListNode head = new SinglyLinkedListNode();
        SinglyLinkedListNode singlyLinkedListNode3 = new SinglyLinkedListNode();
        SinglyLinkedListNode singlyLinkedListNode2 = new SinglyLinkedListNode();

        singlyLinkedListNode3.data = 3;
        singlyLinkedListNode3.next = null;
        singlyLinkedListNode2.data = 2;
        singlyLinkedListNode2.next = singlyLinkedListNode3;
        head.data = 1;
        head.next = singlyLinkedListNode2;

        SinglyLinkedListNode head2 = new SinglyLinkedListNode();
        head2.data = 1;
        head2.next = singlyLinkedListNode3;

        findMergeNode(head, head2);

    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode currentHead1 = head1;
        SinglyLinkedListNode currentHead2 = head2;
        Set<SinglyLinkedListNode> check = new HashSet<>();

        while (currentHead1 != null) {
            check.add(currentHead1);
            currentHead1 = currentHead1.next;
        }
        while(currentHead2 !=null){
            if(!check.add(currentHead2)){
                return currentHead2.data;
            }
            currentHead2 = currentHead2.next;
        }
        return 0;
    }
}
