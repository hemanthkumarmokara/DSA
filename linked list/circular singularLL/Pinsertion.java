public class Pinsertion {
    Node head;
    Node last;
    class Node{
        Node next;
        int data;
        Node (int item){
            data = item;
        }
    } 
    public void cicularL2(){
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
    /*
public void Pinsertt(int pos,int data){
    
    Node ptr1 = null;
    Node ptr2 = head;
    Node newNode = new Node(data);
    int v=1;
    if (last == null){
        last = newNode;
    }
    else{ 
    while (v<pos){
        ptr1 = ptr2;
        ptr2 = ptr2.next;
    }
    ptr1.next = newNode;
    newNode.next = ptr2;
}} */
void Piinsert(int pos, int data) 
 { 
 int i=1; 
 //Create a new node 
 Node newNode = new Node(data); 
 Node ptr=head; 
 if(pos>1) { 
 while(i<pos-1) { 
 if(ptr.next==head) { 
 System.out.println("Sufficient nodes aren't present"); 
 //return; 
 } 
 else{ 
 ptr=ptr.next; 
 ++i; 
 } 
 } 
 newNode.next=ptr.next; 
 ptr.next = newNode; 
 } 
 else{ 
 while(ptr.next!= head) { 
 ptr=ptr.next; 
 } 
 newNode.next=head; 
 head=newNode; 
 ptr.next=newNode; 
 } 
 } 

    public static void main(String[] args) {
        Pinsertion jk = new Pinsertion();
        jk.cicularL2();
        jk.display();
        System.out.println();
        jk.Piinsert(3, 200);
        jk.display();
        System.out.println();
    
    }    
    
}
