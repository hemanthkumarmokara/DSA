//package linked list.single linkedlist;

public class Fdeletion {
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

   public Node Fdelete(){
    if (head == null){
        return null;
    }
    else {
        Node temp = head;
        head = head.next;
        temp.next=null; 
        return temp;
    }
   }
   
   
   public static void main(String[] args) {
    Fdeletion df = new Fdeletion();
    df.head = new Node(10);
  Node second = new Node(34);
   Node third = new Node(44);
   Node fourth = new Node(345);
  df.head.next = second;
  second.next = third;
  third.next= fourth; 
  System.out.println( df.Fdelete());
    System.out.println( df.display());
    
   
   
    
   
   }


}
    
    

