using System;

class DecimalToBinary
{
    static void Main()
    {
        // Input
        long decimalNumber = long.Parse(Console.ReadLine());

        // Main Logic
        string binaryNumber = "";
        while (decimalNumber > 0)
        {
            int remainder = (int) decimalNumber % 2;
            decimalNumber /= 2;
            binaryNumber = remainder + binaryNumber;
        }

        // Output
        Console.WriteLine(binaryNumber);
    }
}

