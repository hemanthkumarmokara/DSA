import java.util.Arrays;

public class linearsIn2Darray {

	static int[] search2D(int[][] ar,int cop){
		
		int i ,j ;
		for( i=0;i<ar.length;i++){
			for( j=0;j<ar[i].length;j++){
				if(cop == ar[i][j]){
					return new int[]{i,j};
				}
			}
	}  
    return new int[]{-1,-1};

	}
	public static void main(String[] args) {
		int[][] myNumbers = { {11, 22, 33, 44}, {55, 66, 77} };
	     for (int i = 0; i < myNumbers.length; ++i) {
	        for(int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println("myNumbers[" + i + "][" + j + "] = "+ myNumbers[i][j]);
	        }
	     }
		 int[] ans =search2D(myNumbers, 33);
         System.out.println(Arrays.toString(ans));
	   }
	}

	
 
