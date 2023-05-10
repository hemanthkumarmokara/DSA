//package DSA.linked list.circular linkedlist;

public class Linsertion {
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

public void Linsert (int value){
    Node newNode = new Node(value);
    if (last == null){
        last = newNode;
        last.next = last;
    }
    else {
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        length++;

    }
}

 
public static void main(String[] args) {
    Linsertion jk = new Linsertion();
    jk.cicularLL2();
    jk.display();
    jk.Linsert(100);
   
    System.out.println();
    jk.display();
    
 
}


}
