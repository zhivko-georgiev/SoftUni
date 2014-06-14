using System;

public class ExchangeIfGreater
{
    public static void Main()
    {
        // Input
        Console.Write("Please Enter First = ");
        double firstNumber = double.Parse(Console.ReadLine());
        Console.Write("Please Enter Second = ");
        double secondNumber = double.Parse(Console.ReadLine());
        
        // Main Logic
        if (firstNumber > secondNumber)
        {
            double temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
            Console.WriteLine("First = {0}\nSecond = {1}", firstNumber, secondNumber);
        }
        else
        {
            Console.WriteLine("First = {0}\nSecond = {1}", firstNumber, secondNumber);
        }
    }
}
