using System;

class BiggestOf5Numbers
{
    static void Main()
    {
        // Input
        double firstNumber = double.Parse(Console.ReadLine());
        double secondNumber = double.Parse(Console.ReadLine());
        double thirdNumber = double.Parse(Console.ReadLine());

        // Main Logic
        double temp = Math.Max(firstNumber, secondNumber);
        if (temp >= thirdNumber)
        {
            Console.WriteLine("Biggest : {0}", temp);
        }
        else
        {
            Console.WriteLine("Biggest : {0}", thirdNumber);
        }
    }
}
