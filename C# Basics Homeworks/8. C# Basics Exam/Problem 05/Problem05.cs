using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

class Problem05
{
    static void Main()
    {
        // Input
        long n = long.Parse(Console.ReadLine());
        int f = int.Parse(Console.ReadLine());
        int r = int.Parse(Console.ReadLine());

        StringBuilder sb = new StringBuilder();
        
        // Main Logic
        string numberIntoBinary = Convert.ToString(n, 2).PadLeft(19, '0');

        // Filling the StringBuilder with the elements of the string
        for (int j = 0; j < 19; j++)
        {
            sb.Append(numberIntoBinary[j]);
        }

        char freezeBit = sb[18 - f]; // Keeping the bit at position F - freeze bit
        sb.Remove(18 - f, 1);

        // Moving the bits
        for (int i = 0; i < r; i++)
        {
            char bit = sb[sb.Length - 1]; // keep the value at the most right position
            sb.Remove(sb.Length - 1, 1);
            sb.Insert(0, bit);
        }

        // Appending the bit at position F
        sb.Insert(18 - f, freezeBit);
        string finalString = sb.ToString();
        
        // Output - converting the binary number into decimal
        long newNumber = Convert.ToInt64(finalString, 2);
        Console.WriteLine(newNumber);
    }
}
