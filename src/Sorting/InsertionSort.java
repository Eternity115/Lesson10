
package Sorting;

//DO NOT USE THIS FILE
public class InsertionSort {
    private InsertionSort(){} //can not be instantiated
    
    public static void insertionSort(Object[] a){
        int itemToInsert, j;
        boolean stillLooking;
        
        /*on the kth pass, pass item k upwards in list
        and insert it in its proper place amoung
        first k entries in an array
        */
        for (int k = 1; k < a.length; k++) {
            //move backwards through list, looking for the right place to insert a[k]
            itemToInsert = (int) a[k];
            j=k-1;
            stillLooking=true;
            while(j >=0 && stillLooking){
                if (((Comparable)itemToInsert).compareTo (a[j])< 0){
                    //move item higher
                    a[j+1] = a[j];
                    j--;
                }
                else{
                    //we have found new home for a[k];
                    stillLooking = false;
                    a[j+1] = itemToInsert;
                }
            }
        }
    }
    
    
}
