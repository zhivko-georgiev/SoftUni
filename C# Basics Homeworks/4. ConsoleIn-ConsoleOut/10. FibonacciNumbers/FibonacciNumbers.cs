using System;

class FibonacciNumbers
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());

        // Main Logic
        int firstNumber = 1;
        int secondNumber = 0;
        int result = 0;

        for (int i = 1; i <= n; i++)
        {
            if (n == 1)
            {
                Console.Write(result);
            }

            else
            {
                Console.Write(result + " ");
                result = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = result;
            }
        }
        Console.WriteLine();
    }
}
