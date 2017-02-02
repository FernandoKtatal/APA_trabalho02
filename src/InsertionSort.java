
public class InsertionSort {
	 public static void insertion(int[] a){
	      
		 int i,j;
		 
		 for(j=1 ; j<a.length ; j++){
			 int aux = a[j];
			 int x = a[j];
			 for(i=j-1; i>=0 && a[i] > (x); i--){
				 a[i+1] = a[i];
	           }
	           
	           a[i+1]=aux;
	           
	        }
	            
	}

}
