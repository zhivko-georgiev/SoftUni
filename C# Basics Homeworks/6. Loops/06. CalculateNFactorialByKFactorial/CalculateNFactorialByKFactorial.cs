using System;
using System.Numerics;

class CalculateNFactorialByKFactorial
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
        BigInteger result = 1;
        while (n > k)
        {
            result *= n;
            n--;
        }
        Console.WriteLine(result);
    }
}
