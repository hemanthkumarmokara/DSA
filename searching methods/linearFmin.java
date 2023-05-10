public class linearFmin {
    static void Fmin(int[] arr){
        int m = arr[0];
        for(int i=0;i<arr.length;i++){
            if(m>arr[i]){
                m=arr[i];
            }
        }
        System.out.println(m);
    }
    
    public static void main(String[] args) {
        int[] nums = {20,18,34,-19,23,45,-11,24,98};
        Fmin(nums);
    }
}
