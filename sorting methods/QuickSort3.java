public class QuickSort3 {

    static int partitionw1(int[] zoz,int lb,int ub){
        int pivot = zoz[lb];
        int start =lb;
        int end = ub;
        while(start<end){
            while(zoz[start] <=pivot){
                start++;
            }
            while(zoz[end]>pivot){
                end--;
            }
            if(start<end){
                int temp1 = zoz[start];
                zoz[start]=zoz[end];
                zoz[end]=temp1;
            }
            int temp2 = zoz[lb];
            zoz[lb]=zoz[end];
            zoz[end]=temp2;
            
        }
        return end;
    }
    static void qSort3(int[] zoz,int lb,int ub){
        if(lb<ub){
            int loc = partitionw1(zoz, lb, ub);
            qSort3(zoz, lb, loc-1);
            qSort3(zoz,loc+1,ub);
        }
    }

    public static void main(String[] args) {
        int[] fof = {12,23,11,9,4,1,77};
        int lb = 0;
        int y = fof.length;
        int ub =y-1;
        qSort3(fof, lb, ub);
        for(int g=0;g<y;g++){
            System.out.print(fof[g]+" ");
        }
    }
}
