//package DSA.linked list.circular linkedlist;

public class Ldelete {
    Node head;
    Node last;
    int length;
  //  Node first;
    //Node fourth;
class Node{
    Node next;
    int data;
    Node (int data){
        this.data = data;
    }
} 
 
public void cicularL2(){
    Node first = new Node(23);
    Node first1 = new Node(300);
    Node second = new Node(33);
    Node third = new Node(43);
    Node fourth = new Node(53);
    Node first2 = new Node(200);
    first.next = first1;
    first1.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = first2;
    first2.next = first;
     last = first2;
     head = first;
 }
/*
public void display (){
    if ( last == null){
        return;
    }
  else {
    Node ptr = head;
   // System.out.println(ptr.data);
    while(ptr != last){
        System.out.print(ptr.data + " --> ");
        ptr = ptr.next;
    }
    System.out.print(ptr.data);
}
}
 */
void display() 
 { 
 Node ptr = head; 
 if(head == null) { 
 System.out.println("List is empty"); 
 return; 
 } 
// System.out.println("linked list is:"); 
 while(ptr.next != head) 
 { 
 System.out.print(ptr.data + " -> "); 
 ptr = ptr.next; 
 } 
 System.out.print(ptr.data+ "-->"); 
 ptr = ptr.next;
 System.out.print(ptr.data );
 System.out.println(); 
 } 

void Ldeleteeiu() 
 { 
 if(head == null) 
 { 
 System.out.println("UNDERFLOW"); 
 //return; 
 } 
 else if (head == head.next) 
 { 
 System.out.println("Item deleted :" + head.data); 
 head = null; 
// return; 
 } 
 else
 { 
 Node ptr1=null; 
 Node ptr2=head; 
 while(ptr2.next!=head) 
 { 
 ptr1=ptr2; 
 ptr2=ptr2.next; 
 } 
 System.out.println("deleted element at last position is : " + ptr2.data); 
 ptr1.next = head; 
 } 
 } 
public static void main(String[] args) {
    Ldelete jk = new Ldelete();
    jk.cicularL2();
    jk.display();
    System.out.println();
    jk.Ldeleteeiu();
   //jk.derle();
    jk.display();
    
 
}


}
