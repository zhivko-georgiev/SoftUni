using System;

class MatrixOfNumbers
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());

        // Main Logic
        if (n >= 1 && n <= 20)
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    Console.Write(i + j + " ");
                }
                Console.WriteLine();
            }    
        }
        else
        {
            Console.WriteLine("N should be between 1 and 20!");
        }
    }
}
