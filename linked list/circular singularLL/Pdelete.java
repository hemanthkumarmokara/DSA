public class Pdelete {
    Node head;
    Node last;
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
        
        first.next = first1;
        first1.next = second;
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
        System.out.print(ptr.data+ " --> ");
        ptr=ptr.next;
        System.out.print(ptr.data);
       
    }
    }
void insertp(int item,int p){
    Node newnode = new Node(item);
   //Scanner n = new Scanner(System.in);
    
   int i=1;
   Node ptr1=null;
   Node ptr2=head;
   for(i=1;i<p;i++){
     ptr1=ptr2;
     ptr2=ptr2.next;      
   }
   ptr1.next=newnode;
   newnode.next=ptr2;
 }
    public static void main(String[] args) {
        Pdelete jk = new Pdelete();
        jk.cicularL2();
        jk.display();
        System.out.println();
        jk.insertp(354,3);
        jk.display();
        System.out.println();
    
    }    
    
}
