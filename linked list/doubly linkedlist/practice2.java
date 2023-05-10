//package linkedlist;

public class practice2 {
    Node head;
    Node fourth;

    static class Node {
    int data;
    Node next;
    Node pre;
    
    Node (int data){
        this.data = data;
        this.next = null;
    }
   }
   public void Dll(){
   head = new Node(10);
    Node second = new Node(34);
    Node third = new Node(44);
    Node fourth = new Node(345);
   head.next = second;
   head.pre = null;
   second.pre = head;
    second.next = third;
    third.pre = second;
    third.next= fourth;
    fourth.pre = third;
    fourth.next = null;
    //last = fourth;

   }
// this method is to display the elements
   public void display(){
    Node cu = fourth;
    while(cu!=null){
        System.out.print(cu.data +" -->");
        cu =cu.pre;

    }
    System.out.println("null");
   }
//this to find the length of the linked list
   public int length(){
    if (head == null){
        return 0;
    }
    int count =0;
    Node cu = head;
    while(cu!=null){
        count++;
        cu = cu.next;
    }
    //System.out.println("no. of. nodes present in linked list is :  "+ count);
    return count;
   }


   public static void main(String[] args) {
    practice2 df = new practice2();
    df.Dll();
    df.display();
   int uu= df.length();
   System.out.println(uu);

   }


}
    