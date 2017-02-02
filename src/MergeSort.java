

public class MergeSort {
	
	  public static void mergeSort(int[] a){
		  
	        int[] tmp = new int [a.length];
	        mergeSort(a, tmp,  0,  a.length - 1);
	    }


	    private static void mergeSort(int [ ] vec, int [ ] tmp, int begin, int end) { 
	        if (begin < end) {
	            int mid = begin + (end - begin) / 2;
	            mergeSort(vec,tmp,begin, mid); 
	            mergeSort(vec,tmp,mid + 1,end); 
	            merge(vec,tmp,begin, mid + 1, end);
	        }
	    }



	    private static void merge(int [ ] a, int [ ] tmp, int begin, int mid, int end ){
	        int iniEnd = mid - 1;
	        int i = begin;
	        int num = end - begin + 1;

	        while(begin <= iniEnd && mid <= end){
	            if(a[begin] <= (a[mid]))
	                tmp[i++] = a[begin++];
	            else
	                tmp[i++] = a[mid++];
	        }
	            
	        while(begin <= iniEnd){    
	            tmp[i++] = a[begin++];
	        }

	        while(mid <= end){  
	            tmp[i++] = a[mid++];
	        }
	        
	        for(int j = 0; j < num; j++, end--)
	            a[end] = tmp[end];
	    }
	    

}
