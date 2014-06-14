using System;

class Program
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());
        string[] array = new string[n];

        for (int i = 0; i < array.Length; i++)
        {
            Console.Write("Array [{0}] =  ", i);
            array[i] = Console.ReadLine();
        }

        // Main Logic
        int maxSequence = 0;
        string value = null;

        for (int i = 0; i < array.Length; i++)
        {
            int countSequence = 0;
            for (int j = i; j < array.Length; j++)
            {
                if (array[i] == array[j])
                {
                    countSequence++;
                    if (maxSequence < countSequence)
                    {
                        maxSequence = countSequence;
                        value = array[i];
                    }
                }
                else
                {
                    break; 
                }
            }
        }
        // Output
        Console.WriteLine("\nThe element of maximal sequence is \"{0}\", repeated {1} times", value, maxSequence);
    }
}
