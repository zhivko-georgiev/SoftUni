using System;

class MinMaxSumAverage
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());
        double[] arrayOfNumbers = new double[n];

        // Main Logic
        double sum = 0;
        double average = 0;

        for (int i = 0; i < n; i++)
        {
            arrayOfNumbers[i] = double.Parse(Console.ReadLine());
        }
        // Finding the smallest and largest element in the array
        Array.Sort(arrayOfNumbers);
        Console.WriteLine("Min = {0}", arrayOfNumbers[0]);
        Console.WriteLine("Min = {0}", arrayOfNumbers[n - 1]);

        // Finding the sum of the array's elements and their average
        for (int i = 0; i < n; i++)
        {
           sum += arrayOfNumbers[i];
        }
        Console.WriteLine("Sum = {0}", sum);
        average = sum / n;
        Console.WriteLine("Average = {0:F2}", average);
    }
}
