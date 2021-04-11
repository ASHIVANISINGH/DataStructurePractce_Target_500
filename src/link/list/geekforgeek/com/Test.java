package link.list.geekforgeek.com;

public class Test {

    // single link list implementation
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;

        for(Node move=head;move!=null;move=move.next){
            System.out.print(" "+move.data);
        }
    }
}
