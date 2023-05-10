//package linked list.single linkedlist;

public class IatAnyPosition{
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

   public void position(int value){
    Node fg = new Node(value);
    int p = 1;
    Node ptr1 = null;
    Node ptr2=head;
    while (p<4){
        ptr1 = ptr2;
        ptr2 = ptr2.next;
       ++p;
    }
    ptr1.next=fg;
    fg.next=ptr2;
   }

   public static void main(String[] args) {
    IatAnyPosition df = new IatAnyPosition();
    df.head = new Node(10);
  Node second = new Node(34);
   Node third = new Node(44);
   Node fourth = new Node(345);
  df.head.next = second;
  second.next = third;
  third.next= fourth;
    df.position(121);
    System.out.println( df.display());
   
    
   
   }


}
    
    

