import java.util.*;

public class stack1 {
    int stacc[];
    int top;
    int maxstack;
    stack1(int n){
        stacc = new int[n];
        top = -1;
        maxstack = n-1;
    }
    void pushh(int item){
        if (top == maxstack){
            System.out.println("overflow");
        }
        else{
            top = top+1;
            stacc[top]= item;      
        }
    }
void popp(){
    int item;
    if (top == -1){
        System.out.println("underflow");
    }
    else{
        item = stacc[top];
    top = top-1;
    System.out.println("deleted item is :"+item);
    }
}
void display(){
System.out.println(    "the elements of the stacc are : ");
for (int i=0;i<stacc.length;i++){
    System.out.println(stacc[i]);
}
}
public static void main(String[] args) {
    int n;
    System.out.println("enter the size of the stackk : ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt(); 
    stack1 t1=new stack1(n); 
    System.out.println("Enter some elements into the Stack"); 
    t1.pushh(sc.nextInt()); 
    t1.pushh(sc.nextInt()); 
    t1.pushh(sc.nextInt()); 
    t1.pushh(sc.nextInt()); 
    t1.pushh(sc.nextInt());
    t1.pushh(sc.nextInt()); 
   t1.display(); 
    t1.popp(); 
    t1.popp(); 
    t1.popp(); 
    t1.popp(); 
    t1.display();
}
}
