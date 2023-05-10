import java.util.Scanner;
public class dll {
     static class Node{
        String data;
        Node Rlink=null;
        Node Llink=null;
        Node(String data){
            this.data=data;
        }
        Node(){
            
        }
    }
    Node start=null;
    int nodes=0;
    
    public void finsert(String data){
        Node nn=new Node(data);
        if(start==null){
            start=nn;
            Node Rlink=null;
        }
        else{
            nn.Rlink=start;
            start.Llink=nn;
            start=nn;

        }
        nodes++;
    }
    public void Anode(String data,int Apos){
        Node nn=new Node(data);
        int co=1;
        Node ptr1=start;
        Node ptr2=ptr1.Rlink;
        while(co<Apos){
            ptr1=ptr2;
            ptr2=ptr2.Rlink;
            co++;
        }
        ptr1.Rlink=nn;
        ptr2.Llink=nn;
        nn.Llink=ptr1;
        nn.Rlink=ptr2;
        nodes++;
    }
    public void Bnode(String data,int Bpos){
        Node nn=new Node(data);
        int co=1;
        Node ptr1=null;
        Node ptr2=start;
        while(co<Bpos){
            ptr1=ptr2;
            ptr2=ptr2.Rlink;
            co++;
        }
        ptr1.Rlink=nn;
        ptr2.Llink=nn;
        nn.Llink=ptr1;
        nn.Rlink=ptr2;
        nodes++;
    }
    public void linsert(String data){
        Node nn=new Node(data);
        Node ptr=start;
        if(start==null){
            start=nn;
            Node Rlink=null;
        }
        else if(start.Rlink==null){
            start.Rlink=nn;
            nn.Llink=start;
            nn.Rlink=null;
        }
        else{
            while(ptr.Rlink!=null){
                ptr=ptr.Rlink;
            }
            ptr.Rlink=nn;
            nn.Llink=ptr;
            nn.Rlink=null;
        }
        nodes++;

    }
    public void fdelete(){
        Node nn=new Node();
        Node ptr1=start;
        Node ptr2=ptr1.Rlink;
        if(start==null){
            System.out.println("underflow");
        }
        else if(ptr1.Rlink==null){
            start=null;
        }
        else{
            start=ptr2;
            ptr2.Llink=null;
        }
        nodes--;
    }
    public void ldelete(){
        Node nn=new Node();
        Node ptr1=start;
        Node ptr2=ptr1.Rlink;
        if(start==null){
            System.out.println("underflow");
        }
        else if(ptr2.Rlink==null){
            start=null;
        }
        else{
            while(ptr2.Rlink!=null){
                ptr1=ptr2;
                ptr2=ptr2.Rlink;
            }
            ptr1.Rlink=null;
        }
        nodes--;
    }
    public void posdelete(int pos){
        Node nn=new Node();
        Node ptr1,ptr2,ptr3;
        ptr1=null;
        ptr2=start;
        ptr3=ptr2.Rlink;
        if(pos==1){
            fdelete();
        }
        else if(pos==nodes){
            ldelete();
        }
        else{
            int k=1;
            while(k<pos){
                ptr1=ptr2;
                ptr2=ptr3;
                ptr3=ptr2.Rlink;
                k++;
            }
            ptr1.Rlink=ptr3;
            ptr3.Llink=ptr1;

        }
        nodes--;
    }
    public void disp(){
        Node nn=new Node();
        Node ptr=start;
        Node Rlink;
        
        //System.out.println("///////////");
        while(ptr!=null){
            System.out.print(ptr.data+"--");
            
            ptr=ptr.Rlink;
        }
        System.out.println("");
        System.out.println("the number of nodes in the doubly linked list are "+nodes);
    }
    public static void main(String[] args){
        dll ll=new dll();
        
        int count;
        Scanner dd=new Scanner(System.in);
        System.out.println("enter a number from the following");
        System.out.println("1-creation of nodes and display of elements");
        System.out.println("2-insertion of element at the front of the doubly linked list");
        System.out.println("3-insertion of element after a given node");
        System.out.println("4-insertion of element at the end of the doubly linked list");
        System.out.println("5-insertion of element before a given node");
        System.out.println("6-deletion of first node in a doubly linked list");
        System.out.println("7-deletion of a node from a particular position");
        System.out.println("8-deletion of last node in a doubly linked list");
        
        while(true){
            count=dd.nextInt();
            if(count==0){
                break;
            }
            switch(count){
                case 1:
                Node nn1=new Node("kohli");
                Node nn2=new Node("rahul");
                Node nn3=new Node("dhoni");
                ll.start=nn1;
                nn1.Rlink=nn2;
                nn1.Llink=null;
                nn2.Llink=nn1;
                nn2.Rlink=nn3;
                nn3.Llink=nn2;
                nn3.Rlink=null;
                ll.nodes+=3;
                ll.disp();
                break;
    
                case 2:
                System.out.println("enter an element to insert");
                ll.finsert(dd.next());
                ll.disp();
                break;

                case 3:
                System.out.println("enter an element and give its position to insert");
                ll.Anode(dd.next(), dd.nextInt());
                ll.disp();
                break;

                case 4:
                System.out.println("enter an element to insert");
                ll.linsert(dd.next());
                ll.disp();
                break;

                case 5:
                System.out.println("enter an element and give its position to insert");
                ll.Bnode(dd.next(), dd.nextInt());
                ll.disp();
                break;

                case 6:
                ll.fdelete();
                ll.disp();
                break;

                case 7:
                System.out.println("give a position of the element to delete");
                ll.posdelete(dd.nextInt());
                ll.disp();
                break;

                case 8:
                ll.ldelete();
                ll.disp();
                break;
            }
        }       
    }
}