package main;

public class DeleteWithoutHeadPointer {
    class Solution {
        void deleteNode(Node del_node)
        {


            del_node.data = del_node.next.data;
            del_node.next = del_node.next.next;
        }
    }
}
