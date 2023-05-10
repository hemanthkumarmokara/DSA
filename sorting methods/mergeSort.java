import java.util.Arrays;

public class mergeSort {
    static int[] sort1(int[] pop){
        if(pop.length==1){
            return pop;
        }
        int mid=pop.length/2;
        int left[]=sort1(Arrays.copyOfRange(pop, 0, mid));
        int right[]=sort1(Arrays.copyOfRange(pop,mid,pop.length));

        return merge1(left,right);
        
    }
    static int[] merge1(int[] first,int[] second){
        int[] hub = new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){

            if(first[i]<second[j]){
                hub[k]=first[i];
                i++;
            }
            else{
                hub[k]=second[j];
                j++;
            }

            k++;
        }
        while(i<first.length){
            hub[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            hub[k]=second[j];
            j++;
            k++;
        }

        return hub;
    }

    public static void main(String[] args) {
        int fog[] = {12,56,98,13,1,5};
        int[] fog1=sort1(fog);
        System.out.println("sorted array is : " +Arrays.toString(fog1));
    }
    
}
