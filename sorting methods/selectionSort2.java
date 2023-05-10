import java.util.*;
public class selectionSort2 {

    static Double[] lol=new Double[5];
    static Double kl2,t1;
    static String hj;


    static void student1(){
        Scanner po = new Scanner(System.in);
        System.out.println("enter the students list..");

    for(int k1=0; k1<5; k1++){

        System.out.println("enter the student name : ");
        po.nextLine();
            
        System.out.println("enter the students cgpa : ");
             kl2 = po.nextDouble();
             lol[k1]=kl2;
               
        String kp=po.nextLine();
        System.out.println("enter the student address : ");
        po.nextLine();
        if(k1==4){
            hj=kp;
        }

        }
    }


    static void selectingSort1(){
        
        System.out.println("student cgpa list is :  ");
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
                Double poy =lol[k];
                lol[k]=lol[loc];
                lol[loc]=poy;
            }
        }
        System.out.println();
        System.out.println("non-decreasing order of students cgpa is : ");
        for(int i1=0;i1<lol.length;i1++){
            System.out.print(lol[i1] + " ,");
            if(i1==lol.length-1){
                System.out.println("highest cgpa in the class is : "+lol[i1] + " and his name is : " + hj);
            }
        }

    }
 


   public static void main(String[] args) {
       student1();
       selectingSort1();
       
   }
}