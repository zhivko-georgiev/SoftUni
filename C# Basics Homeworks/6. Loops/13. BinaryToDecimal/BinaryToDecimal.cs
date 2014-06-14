using System;

class BinaryToDecimal
{
    static void Main()
    {
        // Input
        string binNumber = Console.ReadLine();

        // Main Logic
        long result = 0;
        int power = 1;
        for (int i = binNumber.Length - 1; i >= 0; i--)
        {
            int number = binNumber[i] - '0';
            result += number * power;
            power *= 2;
        }

        // Output
        Console.WriteLine(result);
    }
}
