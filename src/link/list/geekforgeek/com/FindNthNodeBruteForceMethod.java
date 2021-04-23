package link.list.geekforgeek.com;

public class FindNthNodeBruteForceMethod {

    public Node findNthNodeOfLinkListFromLast(Node head,int n){
        // check corner case if link is empty or not
        if(head==null){
            return null;
        }
        // initialize the length
        int len=0;
        Node move=head;
        // count number of node in this link
        while (move!=null){
            len++;
            move=move.next;
        }
        // update this length up to where we can get n th node
        len=len-n;
        move=head;
        // move head pointer up to n the node
        for(int i=0;i<len;i++){
            move=move.next;
        }
        return move;
    }

}
