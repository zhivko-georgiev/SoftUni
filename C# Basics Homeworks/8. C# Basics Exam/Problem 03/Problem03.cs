using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

class Problem03
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());

        // Main Logic
        // First row
        Console.WriteLine("{0}{1}{0}", new string('.', ((2 * n - 1) - n) / 2), new string('#', n));
        // Top of the figure
        for (int i = 0; i < n - 2; i++)
        {
            Console.WriteLine("{0}#{1}#{0}", new string('.', ((2 * n - 1) - n) / 2), new string('.', n - 2));
        }

        // Middle of the figure
        Console.WriteLine("{0}{1}{0}", new string('#', (n / 2) + 1), new string('.', n - 2));

        // Lower Part of the figure
        for (int i = 1, middleDots = (2 * n - 3) - 2 * i; i < n - 1; i++, middleDots -= 2)
        {
            Console.WriteLine("{0}#{1}#{0}" , new string('.', i), new string('.', middleDots));
        }
        
        // Bottom Of the Figure
        Console.WriteLine("{0}#{0}", new string('.', n - 1));
    }
}

