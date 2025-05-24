package LinkedLists;

import java.util.List;

public class InsertGreatestCommonDivisorLL {

    /*
    Given the head of a linked list head, in which each node contains
    an integer value.

    Between every pair of adjacent nodes, insert a new node with a
    value equal to the greatest common divisor of them.

    Return the linked list after insertion.

    The greatest common divisor of two numbers is the largest
    positive integer that evenly divides both numbers.
     */
    public static ListNode insertGreatestCommonDivisors(ListNode head) {

        // Go through Linked List
        // Set currentNode to head
        // Set oldNextNode to be current node's next node

        // Get common divisor between two nodes as node
            // Start at highest minimum value (which is value of smallest node)
            // if it can be divided evenly between both nodes, set it as the divisor

        // Set divisor node as next of current node
        // Set next value of divisor node to oldNextNode
        // Set current node to be oldNextNode
        // Repeat until oldNextNode == null
        if (head.next == null) return head;

        ListNode current = head;
        while (current.next != null) {
            ListNode oldNextNode = current.next;
            int divisorVal = getDivisorEuclidean(current.val, oldNextNode.val);
            ListNode divisorNode = new ListNode(divisorVal, oldNextNode);
            current.next = divisorNode;
            current = oldNextNode;
        }
        return head;
    }

    public static int getDivisorEuclidean(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int getDivisor(int node1, int node2) {
        int divisor = 0;
        for (int i = Math.min(node1, node2); i > 0; i--) {
            if (node1 % i == 0 && node2 % i == 0) {
                divisor = i;
                break;
            }
        }
        return divisor;
    }

}
