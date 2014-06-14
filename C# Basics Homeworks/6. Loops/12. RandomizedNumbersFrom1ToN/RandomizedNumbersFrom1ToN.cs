using System;

class RandomizedNumbersFrom1ToN
{
    static void Main()
    {
        // Input
        int n = int.Parse(Console.ReadLine());
		int[] myArray = new int[n];
		
        // Initial array
		for (int i = 0; i < n; i++)
		{
			myArray[i] = i + 1;
		}
        Console.WriteLine("Initial sequence of numbers : " + String.Join(" ", myArray));

        // Randomizing the numbers
        Random rnd = new Random();
        for (int j = 0; j < n; j++)
        {
            int randomIndex = rnd.Next(0, n);
			int temp = myArray[randomIndex];
			myArray[randomIndex] = myArray[j];
            myArray[j] = temp;
        }

        // Output
        Console.WriteLine("Randomized sequence of numbers : " + String.Join(" ", myArray));
	}
}
