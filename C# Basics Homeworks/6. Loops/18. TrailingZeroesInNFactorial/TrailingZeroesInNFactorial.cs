// Hint : Check exercise 11 (Loops chapter) from the book Introduction to programming with C#

using System;
using System.Numerics;

class TrailingZeroesInNFactorial
{
    static void Main()
    {
        // Input
        Console.Write("Enter a positive integer number N: ");
        int n = int.Parse(Console.ReadLine());

        // Main Logic
        BigInteger factorial = 1;
        int trailingZeroes = 0;
        int sum = 5; // n/5 + n/25 + n/125 + … = the number of trailing zeroes in N!

        //for (int i = 1; i <= n; i++)
        //{
        //    factorial *= i;
        //}
        //Console.WriteLine(factorial);


        // Determining the trailing zeroes without calculating the factorial
        while (n >= sum)
        {
            trailingZeroes += (n / sum);
            sum *= 5;
        }
        Console.Write("The number of the trailing zeroes at the end of ({0}!) is: {1}\n", n, trailingZeroes);
    }
}
