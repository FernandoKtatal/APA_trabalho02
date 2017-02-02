
public class SelectionSort {
	
	public static void selectionSort(int[] vec){
	      int i,j,min;

	      for(i = 0; i<vec.length-1 ;i++){
	          min=i;
	          for(j=i+1;j < vec.length;j++){
	              if(vec[j] <= (vec[min])){
	                  min=j;
	              }             
	          }
	        int aux = vec[min]; 
	        vec[min] =  vec[i];
	        vec[i] = aux;
	      }

	   
	  }


}
