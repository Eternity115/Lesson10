
package Sorting;

//DO NOT USE THIS FILE
public class BubbleSort {
    
    private BubbleSort(){} //can not be instantiated
    
    public static void bubbleSort(Object[] a){
        int k = 0;
        boolean exchangeMade = true;
        //Make up to n-1 passes through array, exit
        //early if no exchanges are made on previous pass
        while ((k < a.length -1) && exchangeMade){
            exchangeMade = false;
            k++;
            for (int j = 0; j < a.length -k; j++) {
                if(((Comparable)a[j]).compareTo(a[j+1]) > 0){
                    swap(a,j,j+1);
                    exchangeMade = true;  
                }
            }
        }
    }
    
    public static void swap(Object[] a,int x, int y){
        Object temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    
}
