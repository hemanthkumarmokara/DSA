// from kunal kushwaha...

import java.util.Arrays;

public class QuickSort2 {
    static void partition2(int[] you,int low,int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot=you[m];
        while(s<=e){
            while(you[s]<pivot){
                s++;
            }
            while(you[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp = you[s];
                you[s] = you[e];
                you[e]=temp;
                s++;
                e--;
            }
        }
        partition2(you, low, e);
        partition2(you, s, high);
         
    }
    public static void main(String[] args) {
        int[] gog = {43,12,13,8,5,11};
        partition2(gog,0,gog.length-1);
        for(int k=0;k<gog.length;k++){
            System.out.println(gog[k]+" ");
        }
        // System.out.println(Arrays.toString(gog));
    }
}
