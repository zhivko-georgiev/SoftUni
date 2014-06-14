using System;

class NumbersNotDivisibleBy3And7
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());

        // Main Logic
        for (int i = 1; i <= n; i++)
        {
            if (!((i % 3 == 0) || (i % 7 == 0)))
            {
                Console.Write(i + " ");
            }
        }
        Console.WriteLine();
    }
}
