import java.util.*;
 public class selectionSort {
 
    public static void main(String[] args) {
        
        Scanner nj = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int rt = nj.nextInt();
         int[] lol = new int[rt];
         System.out.println("enter the elements : ");
         for(int i=0;i<lol.length;i++){ 
            int ll = nj.nextInt();
            lol[i]=ll;
        }
        System.out.println("unsorted array ");
        for(int ii=0;ii<lol.length;ii++){
            System.out.print(lol[ii] + " ,");
        }

        for(int k=0;k<lol.length-1;k++){
            int loc=k;
            for(int j=k+1;j<lol.length;j++){
                if(lol[j]<lol[loc]){
                    loc=j;
                }
            }
            if(loc!=k){
                int poy =lol[k];
                lol[k]=lol[loc];
                lol[loc]=poy;
            }
        }
        System.out.println();
        System.out.println("sorted array");
        for(int i1=0;i1<lol.length;i1++){
            System.out.print(lol[i1] + " ,");
        }

    }
 }