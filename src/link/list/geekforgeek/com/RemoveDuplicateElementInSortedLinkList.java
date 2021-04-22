package link.list.geekforgeek.com;

public class RemoveDuplicateElementInSortedLinkList {
    public void removeDuplicacy(Node head){
        Node curr=head;
        while (curr!=null && curr.next!=null){
            // if we find duplicate element in link list then ignore that element
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }else {
                curr=curr.next;
            }
        }
    }
}
