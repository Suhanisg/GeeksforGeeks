package main;

public class CircularLinkedList {
    class Solution
    {
        boolean isCircular(Node head)
        {
            if(head == null) return true;
            Node current = head.next;
            while(current != null){
                if(current == head) return true;
                current = current.next;
            }
            return false;

        }
    }
}
