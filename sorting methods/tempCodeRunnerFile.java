import java.util.Arrays;

public class mergeSort {
    static char[] sort1(char[] pop){
        if(pop.length==1){
            return pop;
        }
        char mid=(char) (pop.length/2);
        char left[]=sort1(Arrays.copyOfRange(pop, 0, mid));
        char right[]=sort1(Arrays.copyOfRange(pop,mid,pop.length));

        return merge1(left,right);
        
    }
    static char[] merge1(char[] first,char[] second){
        char[] hub = new char[first.length+second.length];

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
        char fog[] = {'h','e','m','a','n','t','h'};
        char[] fog1=sort1(fog);
        System.out.println("sorted array is : " +Arrays.toString(fog1));
    }
    
}
