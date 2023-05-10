import java. util.*; 
public class circularQueue
{ 
 int queue[]; 
 int front; 
 int rear; 
 int size; 
 circularQueue (int n) 
 { 
 queue = new int[n]; 
 front = -1; 
 rear = -1; 
 size = n-1; 
 } 
 void Insert ( int item ) 
 { 
 if ( rear == size & front == 1 ) 
 { 
 System. out. println ( " QUEUE OVERFLOW "); 
 return ; 
 } 
 else if(front = rear+1){
    System.out.println("overflow");
 }
else if ( front == 0 && rear == 0) 
 { 
 rear = rear + 1; 
 front = front + 1; 
 queue [rear] = item; 
 } 
 else
 { 
    if(front !=1 & rear=size){
        rear = 1;
        queue[rear] = item;
 }
 else{
 rear = rear + 1; 
 queue [rear] = item; 
 } 
 } 
}
 void del() 
 { 
 int item; 
 if ( front == 0 || rear == 0) 
 { 
 System. out. println ( "QUEUE UNDERFLOW" ); 
 return; 
 } 
 else if ( front == rear) 
 { 
 item = queue [front]; 
 front = 0;
 rear = 0; 
 }
 else{
    if(front==size & rear<front){
        item = queue[front];
        front = 1;
    }   
 else
 { 
 item = queue [front]; 
 front = front + 1; 
 }
 }
 
 System. out. println ( " Deleted item is :" + item ); 
 } 
 void display() 
 { 
 System. out. println ("The elements of the Queue are :"); 
 for ( int i = 0; i <= rear; i++) 
 { 
 System. out. println ( queue [i] ); 
 } 
 } 
 public static void main ( String args[] ) 
 { 
 int n; 
 System. out. println ( "Enter the size of the Queue" ); 
 Scanner sc = new Scanner (System.in); 
 n = sc. nextInt(); 
circularQueue t1=new circularQueue(n); 
 System. out. println ("Enter some elements into the Queue"); 
 t1.Insert (11); 
 t1.Insert (22); 
 t1.Insert (33); 
 t1.Insert (44); 
 t1.Insert (55); 
 t1.Insert (66); 
 t1.Insert (77); 
 t1.display (); 
 t1.del (); 
 t1.del (); 
 t1.del (); 
 t1.del (); 
 t1.display (); 
 } } 
