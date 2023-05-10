class avl {
    class Node{
      Node Llink;
      int data;
      Node Rlink;
      Node(int data){
        Llink=null;
        this.data=data;
        Rlink=null;
      }
    }
    Node root=null;
    public void insert(int data){
      Node nn=new Node(data);
      if(root==null){
        root=nn;
      }
      else{
        Node ptr1=root;
        Node ptr2=null;
        while(ptr1!=null){
            ptr2=ptr1;
            if(data<ptr1.data){
                ptr1=ptr1.Llink;
                if(ptr1==null){
                    ptr2.Llink=nn;
                    return;
                }
            }      
            else{
                ptr1=ptr1.Rlink;
                if(ptr1==null){
                    ptr2.Rlink=nn;
                    return;
                }
            }
        }
      }
    }
    public void display(Node r){
      if(r==null){
        System.out.println("no root");
      }
      else{
        if(r.Llink!=null){
          display(r.Llink);
        }
        System.out.print(r.data+"--");
        if(r.Rlink!=null){
          display(r.Rlink);
        }
      }
      
      
    }
    public void display1(Node r) {
        if (r == null) {
          System.out.print("no nodes are present");
        } 
        else {
          
          if (r.Llink != null) {
            display(r.Llink);
          }
          if (r.Rlink != null) {
            display(r.Rlink);
          }
          System.out.println(r.data+"--");
        }
      }
      public void display2(Node r) {
        if (r == null) {
          System.out.print("no nodes are present");
        } 
        else {
            System.out.println(r.data+"--");
            if (r.Llink != null) {
                display(r.Llink);
            }
            if (r.Rlink != null) {
                display(r.Rlink);
            }
          
        }
      }
    int g=0,f,k;
    public void bal(Node fac){
      if(fac.Llink!=null){
        fac=fac.Llink;
        bal(fac);
      }
      else if(fac.Rlink!=null){
        fac=fac.Rlink;
        bal(fac);
      }
      g++;
      
    }
    public void bf(Node r){
      bal(r.Llink);
      int left=g;
      bal(r.Rlink);
      int j=g;
      int right=j-left;
      int baf=left-right;
      System.out.println("balancd fac is"+baf);
    }
    Node ptr3,ptr2;
    public void rlt(Node r){
        Node ptr1=null;
        ptr2=null;ptr3=r;
        
        int i=0;
        while(i<1){
            ptr2=ptr3.Llink;
            ptr1=ptr2.Llink;
            i++;
        }
        ptr2.Llink=ptr1;
        ptr2.Rlink=ptr3;
        ptr3.Llink=null;
        Node p=ptr2;
        display(p);
        System.out.println();
        display1(p);
        System.out.println();
        display2(p);
      

    }   
    public static void main(String[] args){
      avl m=new avl();
      m.insert(20);
      m.insert(10);
      m.insert(5);
    //   m.insert(20);
    //   m.insert(11);
    //   m.insert(10);
    //   m.insert(12);
    //   m.insert(7);
    //   m.insert(5);
    //   m.insert(8);
    //   m.insert(6);
    //   m.insert(2);
      
      Node l=m.root;
      m.display(l);
      System.out.println();
      m.display1(l);
      System.out.println();
      m.display2(l);
      m.rlt(l);
      //Node p=m.ptr2;
      //m.display(p);
      //m.bf(l);
      
      
    }
    
  }