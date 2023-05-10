 
 public class Linsertion {
    Node head;
    class Node {
        Node llink;
        Node rlink;
        int info;
    
    Node(int item){
        llink = null;
        rlink = null;
        info = item;

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
public void Linsert2(int info){
    Node newN = new Node(info);
    if (head == null){
        head = newN;
    }
    else{
    Node ptr = head;
    while (ptr.rlink != null){
        ptr =ptr.rlink;
    }
    ptr.rlink=newN;
    newN.llink = ptr;
    newN.rlink = null;
}
}
 public static void main(String[] args) {
    Linsertion lo = new Linsertion();
    lo.Double();
    lo.display();
    System.out.println();
    lo.Linsert2(100);
    lo.display();
    
 }
    
 }