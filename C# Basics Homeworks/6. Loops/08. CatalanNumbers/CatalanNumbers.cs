using System;
using System.Numerics;

class CatalanNumbers
{
    static void Main()
    {
        // Input
        Console.Write("N : ");
        int n = int.Parse(Console.ReadLine());

        // Main Logic
        BigInteger numerator = 1;
        BigInteger denominator = 1;
        for (int i = 2 * n; i >= n + 2 ; i--)
        {
            numerator *= i;
        }
        for (int i = 1; i <= n; i++)
        {
            denominator *= i;
        }
        BigInteger catalanNumber = numerator / denominator;
        
        // Output
        Console.WriteLine(catalanNumber);
    }
}
