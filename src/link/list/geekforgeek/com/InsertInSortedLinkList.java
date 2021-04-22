package link.list.geekforgeek.com;

public class InsertInSortedLinkList {

    public Node InsertionOperation(Node head,int number){
        Node temp=new Node(number); // create the node
        // check corner case if head is empty
        if(head==null){
            return temp;
        }
        // check second corner case if number less than this first element if head
        if(number<head.data){
            temp.next=head;
            return temp;
        }
        // move this pointer when ever number less than current data
        Node move=head;
        while (number<move.data){
            move=move.next;
        }
        // swap the reference and add this temp node
        temp.next=move.next;
        move.next=temp;
        return head;
    }
}
