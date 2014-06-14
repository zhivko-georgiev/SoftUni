using System;

class WordsCounter
{
    static void Main()
    {
        // Input
        string searchedWord = Console.ReadLine().ToLower();
        string input = Console.ReadLine().ToLower();
        string[] words = input.Split(new char[] { ' ', '.', ',' }, StringSplitOptions.RemoveEmptyEntries);
        int counter = 0;
        
        // Main Logic
        for (int i = 0; i < words.Length; i++)
        {
            if (words[i].Contains(searchedWord))
            {
                counter++;
            }
        }

        // Output
        Console.WriteLine(counter);
    }
}

