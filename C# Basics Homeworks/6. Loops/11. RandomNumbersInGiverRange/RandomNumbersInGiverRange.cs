using System;

class RandomNumbersInGiverRange
{
    static void Main()
    {
        // Input
        Console.Write("N : ");
        int n = int.Parse(Console.ReadLine());
        Console.Write("Min : ");
        int min = int.Parse(Console.ReadLine());
        Console.Write("Max : ");
        int max = int.Parse(Console.ReadLine());
        
        // Validating the input
        if (min > max)
        {
            do
            {
                Console.WriteLine("Min should be less or equal to Max!");
                Console.Write("Min : ");
                min = int.Parse(Console.ReadLine());
                Console.Write("Max : ");
                max = int.Parse(Console.ReadLine());
            } 
            while (min > max);    
        }

        // Main Logic
        Random rnd = new Random();
        for (int i = 0; i < n; i++)
        {
            Console.Write("{0}" + " ", rnd.Next(min, max + 1));
        }
        Console.WriteLine();
    }
}
