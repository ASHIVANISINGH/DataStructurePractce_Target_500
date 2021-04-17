package link.list.geekforgeek.com;

public class InsertAtBeginning {
    // insert an element at beginning

    public static Node insetAtBegin(Node head,int data){
        // create new node
        Node newNode=new Node(data);
        // add head in new node
        newNode.next=head;
        // update head or simple return newNode
        // just for practice purpose
        head=newNode;
        return head;
    }

    // insert at end in link list
    public Node insertAtEnd(Node head,int data){
        // creating new node
        Node newNode=new Node(data);
        // check if link list empty or not
        // if empty then directly assign data to it
        if(head==null){
            head=newNode;

        }else {
            // if not empty then move it end and update next point in
            // last node
            Node move=head;
            // moving last
            while (move.next!=null){
                move=move.next;
            }
            // update next point
            move.next=newNode;
        }
        // returning head or reference
        return head;
    }

    // delete from beginning
    public static Node deleteAtBeginning(Node head){
        // check if link list empty or not
        // if empty then return null
        if(head==null){
            System.out.println("No data is present ");
            return null ;
        }
        // first store next pointer in temp
        // after that update next reference in head pointer and return temp node
        Node temp=head.next;
        head.next=null;
        return temp;
    }
    // delete from last
    public static Node deleteFromEnd(Node head){
        // check if head null
        // if head null then return from that position
        if(head==null){
            return null;
        }else if(head.next==null){
            // this another corner case when only one data in link
            // list and return from that
            return null;

        }else {
            // this move  for just before last position in list
            Node move=head;
            while (move.next.next!=null){
                //beforeLast=move;
                move=move.next;
            }
            // delete last node modify last point just before last position
            move.next=null;

        }
        return head;
    }
//    public static Node insertAtGivenPosition(Node head,int data,int position){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//        }else {
//            Node move=head;
//            for(int i=1;i<position;i++){
//                move=move.next;
//            }
//            newNode.next=move.next;
//            move.next=newNode;
//        }
//        return head;
//    }
//   insert at given position in link list
    public static Node insertAtGivenPosition(Node head,int data,int position){
        // first creating node
        Node newNode=new Node(data);
        // check link list is empty of not if empty then just return
        // current new node
        if(head==null){
            return newNode;
        }
        if(position==1){
            // this another corner case where first position  of link list
            newNode.next=head;
            return newNode;
        }
        else {
            // this method simple

            // move for that position
            // move just position minus 2 because first node reference already reached
            // and we have add the node just before position
            //just use example to understand
            // we have 4 length of link list and we want to insert at 4 position then
            // we have to move two time to reach at 3rd position
            Node move=head;
            for(int i=1;i<=position-2 && move!=null;i++){
                move=move.next;
            }
            // check if position grater then size that time just return same link list
            if(move==null){
                return head;
            }
            // here we add the node in link list
            // we just add reference in new node next reference  so that chain is not break
            newNode.next=move.next;
            // here we add the node in link list
            move.next=newNode;
        }
        return head;
    }
    public static Node deleteFromGivenPosition(Node head,int position){
        int size;
        if(head==null){
            System.out.println("No Element present at given location");
            return null;
        }
        if(position==1){
            return head.next;
        }else {
            Node move=head;
            for(int i=1;i<=position-2 && move!=null;i++){
                move=move.next;
            }
            if(move==null){
                System.out.println("Position is not present at given ");
                return head;
            }
            move.next=move.next.next;
        }
        return head;
    }
    public static int sizeOfLinkList(Node head){
        int i=0;
        if(head==null){
            return 0;
        }else {
            Node move=head;
            while (move!=null){
                i++;
                move=move.next;
            }
        }
        return i+1;
    }
    public static void printLinkList(Node head){

        for(Node move=head;move!=null;move=move.next){
            System.out.print("/t"+move.data);
        }
    }

    public static void main(String[] args) {
        int ch;
//        do {
//            System.out.println("Enter the choise ");
//        }while ();
        System.out.println("This is link list");
    }
}
