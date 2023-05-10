
public class binarySearch {
   static int loc = 0;
   static void bSearch(int[] bs,int lb,int ub,int item){
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(bs[mid]==item){
                loc = mid;
                break;
            }
           else if(bs[mid]>item){
                ub=mid-1; 
            }
           else if(bs[mid]<item){
                lb=mid+1; 
            }
        }
        if(loc==0){
            System.out.println("given item location is not found");
        }
        else{
            System.out.println("item location is present in given array : " + loc);
        }

    }



    public static void main(String[] args) {
        int bs[] = {12,34,56,78,90,99,102,113};
        int n = bs.length;
        
        bSearch(bs, 0, n-1, 113);
        
    }

}
