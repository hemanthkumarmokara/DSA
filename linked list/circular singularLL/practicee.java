import java.util.*;
class practicee {
  class Node{
    int info;
    Node link;
    Node(int item){
      info=item;
      link=null;
    }
  }
Node start=null; 
  void finsert(int item){
    Node newnode= new Node(item);
    if(start==null){
      start=newnode;
      start.link=newnode;
    }
    else{
      Node ptr=start;
      while(ptr.link!=start){
        ptr=ptr.link;
     }
      newnode.link=start;
      start=newnode;
      ptr.link=start;    
  }
  }
void linsert(int item){
  Node newnode=new Node(item);
  Node ptr=start;
  if(start==null){
    start=newnode;
    newnode.link=start;
  }
  else{
    while(ptr.link!=start){
    ptr=ptr.link;
  }
  newnode.link=start; 
  ptr.link=newnode;
  } 
}
  void display(){
    Node ptr=start;
    while(ptr.link!=start){
      System.out.println(ptr.info+" ");
      ptr=ptr.link;
    }
    System.out.println(ptr.info);
    ptr=ptr.link;
    System.out.println(ptr.info);
  }
 void insertp(int item,int p){
    Node newnode = new Node(item);
   //Scanner n = new Scanner(System.in);
    
   int i=1;
   Node ptr1=null;
   Node ptr2=start;
   for(i=1;i<p;i++){
     ptr1=ptr2;
     ptr2=ptr2.link;      
   }
   ptr1.link=newnode;
   newnode.link=ptr2;
 }
  void fdelete(){
    Node ptr=start;
   if(start==null){
     System.out.println("Underflow");
   }
    else if(start==start.link){
      start=null;
    }
    else{
      while(ptr.link!=start){
        ptr=ptr.link;
      }
       start=start.link;
       ptr.link=start;
    }
  }
  void ldelete(){
    Node ptr1=null;
    Node ptr2=start;
    if(start==null){
       System.out.println("Underflow");
    }
    else{
       while(ptr2.link!=start){
         ptr1=ptr2;
         ptr2=ptr2.link;
       }
      ptr1.link=start;
    } 
  }
  
  public static void main(String[] args) {
   practicee x = new practicee();
     System.out.println("Enter the case: ");
   while(true){
    Scanner n =new Scanner(System.in);
    int y = n.nextInt();
      switch(y){ 
      case 1:
      x.linsert(20);
      x.display();
        break;
      case 2:
      x.finsert(10);
      x.display();
        break;
      case 3:
      x.linsert(30);
      x.display();
        break;
      case 4:
      x.linsert(40);
      x.display();
        break;
      case 5:
     x.insertp(50,3);
      x.fdelete();
      x.display();
        break;
      case 6:
      x.fdelete();
      x.display();
        break;
      case 7:
        x.ldelete();
        x.display();
      case 8:
        return;
  }
   }   
}
}