 
 public class Ldeletion {
    Node head;

    class Node{
        Node llink;
        Node rlink;
        int info ;
        Node (int item){
            info = item;
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
            System.out.print(ptr.info + " --> ");
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
    public void Ldeleet(){
        if (head == null){
            System.out.println("underflow");
        }
        else if (head.rlink == null){
            System.out.println("the deleted item is : " + head.info);
            head = null;
        }
        else {
            Node ptr1 = null;
            Node ptr2 = head;
            while(ptr2.rlink != null){
                ptr1 =ptr2;
                ptr2 = ptr2.rlink;
            }
            System.out.println("the deleted item is : " + ptr2.info);
            ptr1.rlink = null;
            ptr2.llink = null;             
        }
    }

    public static void main(String[] args) {
        Ldeletion gf = new Ldeletion();
      //  gf.display();
    
     
    
    gf.Double();
    gf.display();
    System.out.println();
    gf.Ldeleet();
    gf.display();
    } 
     }