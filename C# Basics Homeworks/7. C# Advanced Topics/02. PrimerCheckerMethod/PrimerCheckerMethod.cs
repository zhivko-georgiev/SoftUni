using System;

class PrimerCheckerMethod
{
    static void Main()
    {
        // Input
        Console.Write("Number : ");
        double number = double.Parse(Console.ReadLine());

        // Output
        Console.WriteLine("Is it prime : {0}", IsItPrime(number));

    }
    static bool IsItPrime(double number)
    {
        bool IsPrime = true;
        int maxDivider = (int) Math.Sqrt(number);
        if (number == 0 || number == 1)
        {
            IsPrime = false;
            return IsPrime;
        }
        for (int i = 2; i <= maxDivider; i++)
        {
            if (number % i == 0)
            {
                IsPrime = false;
                break;
            }
        }
        return IsPrime;
    }
}
