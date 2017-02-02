
public class QuickSort {
 
      
    public static int pivo_ini(int v[], int begin, int end){
    int pivo;
    int topo, i;
    pivo = v[begin];
    topo = begin;
        for (i = begin + 1; i <= end; i++) {
            if (v[i] < pivo) {
                v[topo] = v[i];
                v[i] = v[topo + 1];
                topo++;
                          
            }
        }
    v[topo] = pivo;

    return topo;
}
   
    
    public static void quick_sort(int[] a,int begin ,int end){

    	int meio;                                               
    	if (begin < end) {
    		meio = pivo_ini(a, begin, end);
    		quick_sort(a, begin, meio-1);
    		quick_sort(a, meio + 1, end);
    	}
    }

}
