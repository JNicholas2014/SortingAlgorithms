/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;
import java.util.*;

/**
 *
 * @author NicholasJefferyM
 */
public class SortingDriver {

     
    static Random ran = new Random();
    static final int size = ran.nextInt(100); //The size of the array to be created
    static Integer[] data = new Integer[size];  //An array of data
    
    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        Random generator = new Random();
        for(int i = 0; i < size; i++){
            int value = generator.nextInt(255); 
            data[i] = value;
        }
        System.out.println("Data created");
        System.out.println("The current data set is:");
        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.print(data[i] + " ");
            if((i % 10 == 0)&&(i != 0))
                System.out.println();
        }
        sorter.sort(data, size);
        System.out.println();
        System.out.println();
        System.out.println("The sorted data set is:");
        for(int i = 0; i < size; i++){
            System.out.print(data[i] + " ");
            if((i % 10 == 0)&&(i != 0))
                System.out.println();
        }
    }
    
}
