using System;
using System.Collections.Generic;

class PrimesInRange
{
    static void Main()
    {
        // Input
        int startNumber = int.Parse(Console.ReadLine());
        int endNumber = int.Parse(Console.ReadLine());

        // Invoke the IsPrime() method
        List<int> primes = IsPrime(startNumber, endNumber);

        // Printing the list
        for (int i = 0; i < primes.Count; i++)
        {
            Console.Write(primes[i]);
            if (i == primes.Count - 1)
	        {
                Console.WriteLine();
		        break;
	        }
            Console.Write(", ");
        }
    }

    public static List<int> IsPrime(int start, int end)
    {
        List<int> primes = new List<int>();

        if (start < 2)
        {
            start = 2;
        }

        for (int i = start; i <= end; i++)
        {

            bool isPrime = true;
            for (int j = 2; (j * j) <= i; j++)
            {
                if ((i % j) == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                primes.Add(i);
            }
        }
        return primes;
    }
}
