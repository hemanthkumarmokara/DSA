  
 public class Pdeletion {
    Node head;

    class Node{
        Node llink;
        Node rlink;
        int data ;
        Node (int item){
            data = item;
            llink = null;
            rlink = null;
        }
    } 
    
    public void display(){
        if ( head == null){
            System.out.println("No sufficient nodes present ");
        }
        else {
           Node ptr = head;
           while(ptr != null){
            System.out.print(ptr.data + " --> ");
            ptr = ptr.rlink;
           }
        }
    }
  
    public void Double(){
        Node first = new Node(16);
        Node second = new Node(17);
        Node third = new Node(18);
        Node fourth = new Node(19);
        first.llink= null;
        first.rlink = second;
        second.llink = first;
        second.rlink = third;
        third.llink = second;
        third.rlink = fourth;
        fourth.llink = third;
        fourth.rlink = null;
        head = first;
    } 
    public void Pdeleet(int pos){
        if (head == null){
            System.out.println("underflow");
        }
        else if (head.rlink == null){
            System.out.println("the deleted item is : " + head.data);
            head = null;
        }
        else{
            int y = 1;
            Node ptr1 = null;
            Node ptr2 = head;
            Node  ptr3;
            while(y<pos){
                ptr1 = ptr2;
                ptr2 = ptr2.rlink;
            }
            System.out.println("the deleted item is : " + ptr2.data);
            ptr3 = ptr2.rlink;
            ptr1.rlink = ptr2.rlink;
            ptr3.llink = ptr1;
            ptr2.rlink = null;
            ptr2.llink = null;



        }
    }

   public void Pdelete(int pos) { 
 int i=1; 
 Node ptr1=null; 
 Node ptr2=head; 
 Node ptr3=null; 
 if(pos>1) 
 { 
 while(i<pos) 
 { 
 if(ptr2.rlink==null) 
 { 
 System.out.println("Sufficient nodes aren't present"); 
 return; 
 } 
 ptr1=ptr2; 
 ptr2=ptr2.rlink; 
 ++i; 
 } 
 try 
 { 
 System.out.println("Item deleted :" + ptr2.data); 
 ptr3 = ptr2.rlink; 
 ptr1.rlink = ptr2.rlink; 
 ptr3.llink = ptr1; 
 ptr2.rlink = null; 
 ptr2.llink = null; 
 } 
 catch(Exception e) 
 {} 
 } 
 else
 { 
 System.out.println("Item deleted :" + ptr2.data); 
 head = head.rlink; 
 head.llink = null; 
 ptr2.rlink = null; 
 } 
 } 

    
    public static void main(String[] args) {
        Pdeletion gf = new Pdeletion();
      //  gf.display();
    
     
    
    gf.Double();
    gf.display();
    System.out.println();
  //  gf.Pdeleet(3);
  gf.Pdelete(3);
    gf.display();
    } 
     }