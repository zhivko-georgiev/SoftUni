using System;

class NumbersComparer
{
    static void Main()
    {
        // First Solution
        double firstNumber = double.Parse(Console.ReadLine());
        double secondNumber = double.Parse(Console.ReadLine());
        Console.WriteLine("Greater : {0}", Math.Max(firstNumber, secondNumber));
        Console.WriteLine("Smaller: {0}", Math.Min(firstNumber,secondNumber));
        
        // Second Solution
        Console.WriteLine("\nGreater: {0}", (firstNumber + secondNumber + Math.Abs(firstNumber - secondNumber)) / 2);
        Console.WriteLine("Smaller: {0}", (firstNumber + secondNumber - Math.Abs(firstNumber - secondNumber)) / 2);
    }
}
