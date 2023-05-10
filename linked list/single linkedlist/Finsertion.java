//package linked list.single linkedlist;

public class Finsertion {
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
   public void display(){
   //Node cu = head;
    while(head!=null){
        System.out.print(head.data +" -->");
        head =head.next;
    }
    System.out.println("null");
   }

   public void Finsert(int value){
    Node eww = new Node(value) ;
    eww.next = head;
    head = eww;
   }
   public static void main(String[] args) {
    Finsertion df = new Finsertion();
    df.head = new Node(10);
   Node second = new Node(34);
   Node third = new Node(44);
   Node fourth = new Node(345);
   df.head.next = second;
    second.next = third;
    third.next= fourth;
    df.Finsert(678);
    //df.Finsert(677);
    //df.Finsert(676);
    //df.Finsert(675);
    df.display();
   
   }


}
    
    

