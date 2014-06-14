using System;

class SortingNumbersMethod
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());

        // Sorting the array
        int[] sortedArray = SortingNumbers(n);

        // Printing the array
        for (int i = 0; i < sortedArray.Length; i++)
        {
            Console.Write(sortedArray[i] + " ");
        }
        Console.WriteLine();
    }
    static int[] SortingNumbers(int count)
    {
        int[] arrayOfNumbers = new int[count];
        for (int i = 0; i < count; i++)
        {
            arrayOfNumbers[i] = int.Parse(Console.ReadLine());
        }
        Array.Sort(arrayOfNumbers);
        return arrayOfNumbers;
    }
}
