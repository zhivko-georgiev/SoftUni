// wikipedia: Най-голяб общ делител
// Алгоритъм на Евклид
//1) За делимо се взима по-голямото число, а за делител - по-малкото число.
//2) Делителя от своя страна се дели на остатъка от частното
//3) Това се повтаря дотогава, докато частното има остатък.
// НОД(18,84)
// 84 : 18 = 4.12 // 84 % 18 = 12
// 18 : 12 = 1.6  // 18 % 12 = 6
// 12 : 6 = 2     // 12 % 6 = 0    => Greatest Common Divisor = 6
// НОД = 6

using System;

class GreatestCommonDivisor
{
    static void Main()
    {
        // Input
        Console.Write("Enter number a: ");
        double a = double.Parse(Console.ReadLine());
        Console.Write("Enter number b: ");
        double b = double.Parse(Console.ReadLine());

        // Exchange values if a < b
        if (a < b)
        {
            double temp = a;
            a = b;
            b = temp;
        }

        // Main Logic
        double result;
        double resultRemainder;

        Console.WriteLine();
        while (true)
        {
            result = a / b;
            resultRemainder = a % b;
            if (resultRemainder != 0)
            {
                Console.WriteLine("{0} : {1} = {2} ; remainder = {3}", a, b, result, resultRemainder);
                a = b;
                b = resultRemainder;
            }
            else
            {
                Console.WriteLine("{0} : {1} = {2} ; remainder = {3}", a, b, result, resultRemainder);
                Console.WriteLine("The Greatest Common Divisor is: {0}", b);
                break;
            }
        }
    }
}
