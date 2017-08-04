using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortingAlgorithms
{
    class SortDriver
    {
        public static void Main(string[] args)
        {
            SelectionSort S = new SelectionSort();
            Random ran = new Random();
            int size = ran.Next(100);
            Random generator = new Random();
            int[] data = new int[size];
            for (int i = 0; i < size - 1; i++)
            {
                data[i] = generator.Next(255);
            }
            Console.WriteLine("Data Created");
            Console.WriteLine("The current data set is as follows: ");
            Console.WriteLine();
            for (int i = 0; i < size; i++) {
                Console.Write(data[i] + " ");
                if ((i % 10 == 0) && (i != 0))
                    Console.WriteLine();
            }   

            S.sort(data, size);
            Console.WriteLine();
            Console.WriteLine("The sorted data set is as follows: ");
            for (int i = 0; i < size; i++)
            {
                Console.Write(data[i] + " ");
                if ((i % 10 == 0) && (i != 0))
                    Console.WriteLine();
            }
            Console.WriteLine();
            
        }
    }
}
