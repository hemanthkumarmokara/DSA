 

public class linearSearch2 {

    public static void main(String[] args) {
        String name = "hemanth";
        char tgt = 'z';
        boolean ans = stringSearch(name,tgt);
        System.out.println(ans);
    }

   static boolean stringSearch(String str ,char tgt){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(tgt == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

   
}
