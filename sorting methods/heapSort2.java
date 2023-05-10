class heapSort2 
{ 
 void heapify (int A[], int n, int i) 
 { 
 int max = i; 
 int left = 2*i+1; 
 
 int right = 2*i+2; 
 
 if(left < n && A[left] > A[max]) 
 max = left; 
 if(right < n && A[right] > A[max]) 
 max = right; 
 if(max != i) 
 { 
 int temp = A[max]; 
 A[max] = A[i]; 
 A[i] = temp; 
 heapify(A,n,max); 
 } 
 } 
 public void Hsort( int A[], int n ) 
 { 
 for(int i=n/2-1; i>=0; i--) 
 heapify(A,n,i); 
 for(int i=n-1; i>=0; i--) 
 { 
 int temp = A[0]; 
 A[0] = A[i]; 
 
 A[i] = temp; 
 heapify(A,i,0); 
 } 
 } 
 
 public static void main(String args[]) 
 { 
 heapSort2 hs = new heapSort2(); 
 int[] A = { 9,14,3,2,43,11,58,22 }; 
 int n = A.length; 
 int lb=0, ub=n-1; 
 System.out.println("Before Sorting the elements are :\n"); 
 
 for(int i=0; i<n ; i++) 
 { 
 System.out.print( A[i] + " " ); 
 } 
 System.out.println(); 
 
 hs.Hsort(A, n); 
 
 System.out.println("\nAfter Sorting the elements are :\n"); 
 
 for(int i=0; i<n; i++) 
 { 
 System.out.print( A[i] + " " ); 
 } 
 } 
} 