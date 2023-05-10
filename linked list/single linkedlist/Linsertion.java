//package linked list.single linkedlist;

public class Linsertion {
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

   public void Linsert(int value){
    Node exx = new Node(value);
    if (head == null){
        head = exx;
    }
    else {
        Node tt = head;
        while(tt.next != null){
            tt=tt.next;
        }
        tt.next=exx;
    }
   
   }
   public static void main(String[] args) {
    Linsertion df = new Linsertion();
    df.head = new Node(10);
  Node second = new Node(34);
   Node third = new Node(44);
   Node fourth = new Node(345);
  df.head.next = second;
  second.next = third;
  third.next= fourth;
    df.Linsert(121);
    System.out.println( df.display());
   
    
   
   }


}
    
    

