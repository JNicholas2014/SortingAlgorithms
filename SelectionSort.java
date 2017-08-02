package sortingalgorithms;
import java.util.*;

/**
 * 
 * @author NicholasJefferyM
 */
public class SelectionSort {
    public  <T extends Comparable<? super T>> void sort(T[] array, int n){
        for (int index = 0; index < n - 1; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(array, index, n - 1);
            swap(array, index, indexOfNextSmallest);

        } 
    }
    public  <T extends Comparable<? super T>> 
        int getIndexOfSmallest(T[] array, int first, int last){
              
        T min = array[first];
        int indexOfMinimum = first;
        for(int index = first + 1; index <= last; index++){
            if (array[index].compareTo(min) < 0){
                min = array[index];
                indexOfMinimum = index;
            }
        }
        return indexOfMinimum;
    }
    
    public <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /*************************************
     * Constructors
     *************************************/
    
}
    
