using System;

class NullValuesArithmetic
{
    static void Main()
    {
        // Integer
        int? someInteger = null;
        Console.WriteLine("This is the integer with Null value -> " + someInteger);
        someInteger = 5;
        Console.WriteLine("This is the integer with value 5 -> " + someInteger);
        // Floating-point
        double? someDouble = null;
        Console.WriteLine("This is the real number with Null value -> " + someDouble);
        someDouble = 2.5;
        Console.WriteLine("This is the real number with value 5 -> " + someDouble);
    }
}
