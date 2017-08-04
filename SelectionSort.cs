using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace SortingAlgorithms
{
    public class SelectionSort
    {
        public  void sort<T> (T[] arr, int n) where T : IComparable
        {
          for(int index = 0; index < n - 1; index++)
            {
                int indexOfNextSmallest = getIndexOfSmallest(arr, index, n - 1);
                swap(arr, index, indexOfNextSmallest);
            }
        }

        public  int getIndexOfSmallest<T>(T[] arr, int first, int last) where T : IComparable
        {
            T: IComparable min = arr[first];
            int indexOfMinimum = first;
            for(int i = first + 1; i <= last; i++)
            {
                if (arr[i].CompareTo(min) < 0)
                {
                    min = arr[i];
                    indexOfMinimum = i;
                }
            }
            return indexOfMinimum;
        }

        public   void swap<T>(T[] arr, int i, int j) where T : IComparable
        {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
