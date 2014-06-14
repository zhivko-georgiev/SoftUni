using System;
using System.Numerics;

class NumberOfCombinations
{
    static void Main()
    {
        // Input
        Console.Write("N : ");
        int n = int.Parse(Console.ReadLine());
        Console.Write("K : ");
        int k = int.Parse(Console.ReadLine());

        // Validating the input
        while (!(k > 1 && n > k && n < 100))
        {
            Console.WriteLine("1 < K < N < 100");
            Console.Write("N : ");
            n = int.Parse(Console.ReadLine());
            Console.Write("K : ");
            k = int.Parse(Console.ReadLine());
        }

        // Main Logic
        BigInteger numerator = 1;
        BigInteger denominator = 1;
        for (int i = n; i > k; i--)
        {
            numerator *= i;
        }
        for (int i = 1; i <= (n - k); i++)
        {
            denominator *= i;
        }
        BigInteger result = numerator / denominator;
        
        // Output
        Console.WriteLine(result);
    }
}
