using System;

class NumbersFrom1ToN
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());

        // Main Logic
        for (int i = 1; i <= n; i++)
        {
            Console.Write(i + " ");
        }
        Console.WriteLine();
    }
}
