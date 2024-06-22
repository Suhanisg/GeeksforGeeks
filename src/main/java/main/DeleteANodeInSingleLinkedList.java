package main;

public class DeleteANodeInSingleLinkedList {
    class GfG
    {
        Node deleteNode(Node head, int x)
        {
            Node temp=head;
            Node prev = null;
            x--;
            while(temp!=null){
                if(x==0){
                    if(prev == null){
                        head = temp.next;
                    }
                    else
                        prev.next=temp.next;
                    return head;
                }
                x--;
                prev=temp;
                temp=temp.next;
            }
            return head;
        }
    }

}
