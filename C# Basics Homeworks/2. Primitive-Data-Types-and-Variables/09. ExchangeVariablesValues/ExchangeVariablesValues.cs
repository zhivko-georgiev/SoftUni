using System;

class ExchangeVariablesValues
{
    static void Main()
    {
        // Original Values
        Console.WriteLine("Original Values:");
        int a = 5;
        Console.WriteLine("a = {0}", a);
        int b = 10;
        Console.WriteLine("b = {0}", b);
        
        // Exchanged Values
        a = a + b;
        b = a - b;
        a = a - b;
        Console.WriteLine("Exchanged Values:");
        Console.WriteLine("a = {0}", a);
        Console.WriteLine("b = {0}", b);
    }
}
