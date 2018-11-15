//DO NOT USE THIS FILE
package Sorting;


public class SelectionSort {
    
    private SelectionSort(){} //can not be instantiated
    
    public static void selectionSort(Object[] a){
        for (int i = 0; i < a.length-1; i++) {
            int minIndex = findMinimum(a,i);
            if(minIndex !=i){
                //if lowest is not already in place
                swap (a,i, minIndex);
            }
        }
    }
    
    public static void swap(Object[] a,int x, int y){
        Object temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    public static int findMinimum (Object[] a, int first){
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (((Comparable)a[i]).compareTo(a[minIndex]) < 0){
                minIndex = i;
            }
        }
        return minIndex;
    }
}
