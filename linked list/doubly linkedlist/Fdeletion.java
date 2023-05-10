  
 public class Fdeletion{
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
public void Fdeleet(){
    Node ptr = head;
     if (head == null){
        System.out.println("there is no sufficeint nodes present to delete");
     }
     else if (head.rlink == null){
        System.out.println("the deleted item is :" + head.data);
        head = null;
     }
     else{
        System.out.println("the deleted item is : " + head.data);
        head = head.rlink;
        head.llink = null;
        ptr.rlink=null;
     }
}
public static void main(String[] args) {
    Fdeletion gf = new Fdeletion();
  //  gf.display();

 

gf.Double();
gf.display();
System.out.println();
gf.Fdeleet();
gf.display();
} 
 }