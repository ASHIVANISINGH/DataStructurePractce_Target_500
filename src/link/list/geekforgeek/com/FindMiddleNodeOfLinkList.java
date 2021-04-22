package link.list.geekforgeek.com;

public class FindMiddleNodeOfLinkList {

    // this is brute force method
    public Node findMiddle(Node head){
        Node move=head;
        int len=0;
        // count length
        while (move!=null){
            len++;
            move=move.next;
        }
        move=head;
        // move this pointer to length/2
        for(int i=0;i<len/2;i++){
            move=move.next;
        }
        System.out.println(move.data);
        return head;
    }
}
