package link.list.geekforgeek.com;

public class FindPositionInLinkListIterativeApproach {
    public static int  iterativeApproach(Node head,int number){
        int i=0;
        for(Node move=head;move!=null;move=move.next){

            if(move.data==number){
                return i;
            }
            i++;

        }
        return -1;
    }

    public static void main(String[] args) {
        Node head=new Node(101);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        System.out.println("Position of Data : "+iterativeApproach(head,30));

    }
}
