package link.list.geekforgeek.com;

public class SearchMethodRecursiveApproach {


//    public static int searchMethod(Node head,int number,int i){
//       // int i=0;
//        if(head==null){
//            return -1;
//        }
//        //i++;
//        if(head.data==number){
//            return i;
//        }
//        i++;
//         return searchMethod(head.next,number,i);
//
//    }

    public static int searchMethod(Node head,int number){
        // int i=0;

        if(head==null){
            return -1;
        }
      if(head.data==number){
          return 1;
      }else {
          int res = searchMethod(head, number);
          if (res == -1) {
              return -1;
          } else {
              return (res + 1);

          }
      }


    }

    public static void main(String[] args) {
        Node head=new Node(103);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        System.out.println(""+searchMethod(head,20));
    }
}
