//package linked list.single linkedlist;

public class DatAnyposition{
    Node head;
    Node ss;

    static class Node {
    int data;
    Node next;
    
    Node (int data){
        this.data = data;
        this.next = null;
    }
   }
// this method is to display the elements
   public Node display(){
   //Node cu = head;
    while(head!=null){
        System.out.print(head.data +" -->");
        head =head.next;
    }
    return head;
    //System.out.println("null");
   }
   public void positionn(int val) {
    if ( head == null){
        System.out.println("underfloww");
    }
    else if (val ==1){
        Node temp = head;
        head = head.next;
        temp.next = null;
    }
    else {
        Node ptr1 = null;
        Node ptr2 = head;
        int h = 1;
        while (h<val){
            ptr1=ptr2;
            ptr2=ptr2.next;
            h++;
        }
        if (ptr2.next == null){
                System.out.println(" no sufficient nodes are present");
        }
        ptr1.next =ptr2.next;
        ptr2.next = null;
    }

   }  
   
   
   public static void main(String[] args) {
    DatAnyposition df = new DatAnyposition();
    df.head = new Node(10);
  Node second = new Node(34);
   Node third = new Node(44);
   Node fourth = new Node(345);
  df.head.next = second;
  second.next = third;
  third.next= fourth;  
     df.positionn(1);
    System.out.println( df.display());
    
   
   
    
   
   }


}
    
    

