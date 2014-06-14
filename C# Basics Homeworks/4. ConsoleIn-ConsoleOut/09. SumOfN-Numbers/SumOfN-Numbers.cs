using System;

class SumOfNNumbers
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());
        
        // Main Logic
        double sum = 0;
        for (int i = 0; i < n; i++)
        {
            double number = double.Parse(Console.ReadLine());
            sum += number;
        }

        // Output
        Console.WriteLine(sum);
    }
}
