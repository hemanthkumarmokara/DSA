public class linearSearch1 {
    

    static int Lsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int i; 
        for(i=0;i<arr.length;i++){

            if(arr[i] == target){
                 return i;
            }
        }
        return -1;
    }


    
    static int Lsearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int i; 
        for(i=0;i<arr.length;i++){

            if(arr[i] == target){
                 return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    
    static boolean Lsearch31(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        int i; 
        for(i=0;i<arr.length;i++){

            if(arr[i] == target){
                 return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {22,32,34,45,56,67,-23,-34,-76};
        int ans =Lsearch(nums, 506);
        System.out.println(ans);
        boolean ans1 =Lsearch31(nums,56);
        System.out.println(ans1);
        int ans3 =Lsearch2(nums, 67);
        System.out.println(ans3);
        
        
    }
}
