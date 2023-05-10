//package linkedlist;

public class SingleLL {
    Node head;

    static class Node {
    int data;
    Node next;
    
    Node (int data){
        this.data = data;
        this.next = null;
    }
   }
// this method is to display the elements
   public void display(){
    Node cu = head;
    while(cu!=null){
        System.out.print(cu.data +" -->");
        cu =cu.next;

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
    SingleLL df = new SingleLL();
    df.head = new Node(10);
    Node second = new Node(34);
    Node third = new Node(44);
    Node fourth = new Node(345);
   df.head.next = second;
    second.next = third;
    third.next= fourth;
    df.display();
   int uu= df.length();
   System.out.println(uu);

   }


}
    