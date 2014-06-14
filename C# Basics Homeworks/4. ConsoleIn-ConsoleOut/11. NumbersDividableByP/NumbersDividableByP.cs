using System;

class NumbersDividableByP
{
    static void Main()
    {
        // Input
        int startNumber = int.Parse(Console.ReadLine());
        int endNumber = int.Parse(Console.ReadLine());
        
        // Main Logic
        int counter = 0;
        for (int i = startNumber; i <= endNumber; i++)
        {
            if (i % 5 == 0)
            {
                Console.Write(i + " ");
                counter++;
            }
        }

        // Output
        Console.WriteLine();
        Console.WriteLine("There are {0} numbers dividable by 5 with remainder 0 in the interval [{1}, {2}]", 
            counter, startNumber, endNumber);
    }
}
