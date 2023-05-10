import java. util.*; 
public class queue1 
{ 
 int queue[]; 
 int front; 
 int rear; 
 int size; 
 queue1 (int n) 
 { 
 queue = new int[n]; 
 front = -1; 
 rear = -1; 
 size = n-1; 
 } 
 void Insert ( int item ) 
 { 
 if ( rear == size ) 
 { 
 System. out. println ( " QUEUE OVERFLOW "); 
 return ; 
 } 
else if ( front == 0 && rear == 0) 
 { 
 rear = rear + 1; 
 front = front + 1; 
 queue [rear] = item; 
 } 
 else
 { 
 rear = rear + 1; 
 queue [rear] = item; 
 } 
 } 
 void del() 
 { 
 int item; 
 if ( front == 0) 
 { 
 System. out. println ( "QUEUE UNDERFLOW" ); 
 return; 
 } 
 if ( front == rear) 
 { 
 item = queue [front]; 
 front = 0; 
 } 
 else
 { 
 item = queue [front]; 
 front = front + 1; 
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
queue1 t1=new queue1 (n); 
 System. out. println ("Enter some elements into the Queue"); 
 t1.Insert (1); 
 t1.Insert (2); 
 t1.Insert (3); 
 t1.Insert (4); 
 t1.Insert (5); 
 t1.display (); 
 t1.del (); 
 t1.del (); 
 t1.del (); 
 t1.del (); 
 t1.display (); 
 } } 
