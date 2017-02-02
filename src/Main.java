import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
	     	int op;
	     	op = Integer.parseInt(args[0]);
	   	
	   	
	   	    Scanner input = new Scanner(System.in);
			
			
	   	    
			int n = input.nextInt();
			int arr[] = new int [n];
			
			for(int i = 0; i < n; i++){
				arr[i] = input.nextInt();
		}
			



		switch(op){
	 	case 1:
	 		long tInicial1 = System.currentTimeMillis();
	 		long tFinal1;
	 		InsertionSort.insertion(arr);
	 		
	 		tFinal1 = System.currentTimeMillis();
	 		System.out.println("insertion time: " + (tFinal1 - tInicial1));
	        break;

	       case 2:
		 		long tInicial2 = System.currentTimeMillis();
		 		long tFinal2;
		 		SelectionSort.selectionSort(arr);
		 		tFinal2 = System.currentTimeMillis();
		 		System.out.println("selection time: " + (tFinal2 - tInicial2));
	        break;

	       case 3:
	    	   long tInicial3 = System.currentTimeMillis();
	    	   long tFinal3;
	    	   QuickSort.quick_sort(arr,0,(arr.length-1));
	    	   tFinal3 = System.currentTimeMillis();
	    	   System.out.println("quick time: "+ (tFinal3 - tInicial3));
	       	break;

	       	case 4:
	       		long tInicial4 = System.currentTimeMillis();
	       		long tFinal4;
	       		MergeSort.mergeSort(arr);
	       		tFinal4 = System.currentTimeMillis();
	       		System.out.println("Merge time: " + (tFinal4 - tInicial4));
	    
	       		
	       	break;

	       	case 5:
	       		long tInicial5 = System.currentTimeMillis();
	       		long tFinal5;
	       		HeapSort.sort(arr);
	       		tFinal5 = System.currentTimeMillis();
	       		System.out.println("Heap time: " + (tFinal5 - tInicial5));
	       
	       	break;
	       	
	       	case 6:
	       		long tInicial6 = System.currentTimeMillis();
	       		long tFinal6;
	            Arrays.sort(arr);
	       		tFinal6 = System.currentTimeMillis();
	       		System.out.println("Java time: " + (tFinal6 - tInicial6));
	       		
	       	break;

	       	
	    }
		
		input.close();

	} 

}
