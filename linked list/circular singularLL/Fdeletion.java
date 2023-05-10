 //package DSA.linked list.circular linkedlist;

public class Fdeletion {
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
 
 
public void cicularLL2(){
   Node first = new Node(23);
   Node second = new Node(33);
   Node third = new Node(43);
   Node fourth = new Node(53);
   first.next = second;
   second.next = third;
   third.next = fourth;
   fourth.next = first;
    last = fourth;
    head = first;
}

public void display (){
    if ( last == null){
        return;
    }
  else {
    Node ptr = last.next;
   // System.out.println(ptr.data);
    while(ptr != last){
        System.out.print(ptr.data + " --> ");
        ptr = ptr.next;
    }
    System.out.print(ptr.data);
}
}


public void Fdelete() {
    Node ptr = last.next;
    if (head == null){
     System.out.println("undeflow");
    }
    else if(head == head.next){
     System.out.println("item deleted : " + head.data);
     head = null;
    }
    else { 
     System.out.println("Item deleted :" + head.data); 
        last.next = ptr.next;
    }
    ptr.next = null;
    length--;
}
public void search(int data){
    Node newNode=new Node(data);
    Node ptr=head;
    Boolean check=true; 
    while(ptr.next!=null){
    if(ptr.data==data){
    check=true;
    break;
    }
    else{
    check=false;
    }
    ptr=ptr.next;
    }
    if(check==true){
    System.out.println("given element is present in the list");
    }
    else{
    System.out.println("given element is not present in the list");
    }
    }
public static void main(String[] args) {
    Fdeletion jk = new Fdeletion();
    jk.cicularLL2();
    jk.display();
    System.out.println();
   //  jk.Fdelete();
   jk.search(43);
    System.out.println();
    jk.display();
    
}
}
