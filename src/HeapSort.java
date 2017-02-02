
public class HeapSort {
	private static int total;

    private static void swap(int[] v, int a, int b){
        int c = v[a];
        v[a] = v[b];
        v[b] = c;
    }

    private static void heapify(int[] vec, int i){
        int esq = i * 2;
        int dir = esq + 1;
        int pai = i;

        if (esq <= total && vec[esq] > (vec[pai])){
            pai = esq;
        } 
        if (dir <= total && vec[dir] > (vec[pai])){
         pai = dir;
        } 
        if (pai != i) {
            swap(vec, i, pai);
            heapify(vec, pai);
        }
    }

    public static void sort(int[] vec){
    	
        total = vec.length - 1;

        for (int i = total / 2; i >= 0; i--)
            heapify(vec, i);

        for (int i = total; i > 0; i--) {
            swap(vec, 0, i);
            total--;
            heapify(vec, 0);
        }
    }


}
