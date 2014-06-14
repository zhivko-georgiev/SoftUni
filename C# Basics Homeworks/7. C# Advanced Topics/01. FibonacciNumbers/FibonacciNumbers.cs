using System;

class FibonacciNumbers
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());

        // Output
        Console.WriteLine(Fib(n));
    }
    static int Fib(int number)
    {
        int firstMember = 1;
        int secondMember = 0;
        int result = 0;
        for (int i = 0; i <= number; i++)
        {
            if (number == 0 || number == 1)
            {
                return firstMember;
            }
            else
            {
                result = firstMember + secondMember;
                firstMember = secondMember;
                secondMember = result;
            }
        }
        return result;
    }
}
