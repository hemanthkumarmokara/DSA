//package linked list.single linkedlist;

public class Ldeletion {
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

   public Node Ldelete(){
    if (head == null || head.next==null){
        return head;
    }
    else {
        Node ptr2=head;
        Node ptr1=null;
        
        while(ptr2.next != null){
            ptr1=ptr2;
            ptr2=ptr2.next;
        }
        ptr1.next=null;
        return ptr2;
    }
   }
   
   
   public static void main(String[] args) {
    Ldeletion df = new Ldeletion();
    df.head = new Node(10);
  Node second = new Node(34);
   Node third = new Node(44);
   Node fourth = new Node(345);
  df.head.next = second;
  second.next = third;
  third.next= fourth; 
  df.Ldelete();    
    System.out.println( df.display());
    
   
   
    
   
   }


}
    
    

