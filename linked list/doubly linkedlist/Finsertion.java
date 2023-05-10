  
 public class Finsertion {
    Node head = null;
    class Node {
        Node llink;
        Node rlink;
        int data;
        Node (int item){
            llink = null;
            rlink = null;
            data = item;
        }
    }
    public void Finsert(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head= newNode;
            }
        else {
            newNode.rlink = head;
            head.llink = newNode;
            head = newNode;

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
    
public static void main(String[] args) {
    Finsertion gf = new Finsertion();
  //  gf.display();

gf.Finsert(78);
//gf.Finsert(79);
//gf.Finsert(80);
//gf.Finsert(85);
gf.display();
gf.Double();
gf.display();
} 
 }