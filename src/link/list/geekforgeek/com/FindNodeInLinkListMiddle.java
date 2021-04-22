package link.list.geekforgeek.com;

public class FindNodeInLinkListMiddle {
    // Efficient Approach
    public Node findMiddle(Node head){
        //check corner case if link list is empty
        if(head==null){
            return null;
        }
        //check second corner case if only one element is present
        if(head.next==null){
            System.out.println(head.data);
            return head;
        }
        // idea is simple move two pointer one pointer move
        //by one node and other move by 2 node when second pointer reach end then slow
        // pointer reach the middle
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //simple print data
        System.out.println(fast.data);
        return head;
    }
}
