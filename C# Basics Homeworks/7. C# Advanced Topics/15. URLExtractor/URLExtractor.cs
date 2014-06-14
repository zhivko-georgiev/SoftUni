using System;

class URLExtractor
{
    static void Main()
    {
        // Input
        string input = Console.ReadLine();
        string[] words = input.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

        // Main Logic
        string http = "http://";
        string www = "www.";

        for (int i = 0; i < words.Length; i++)
        {
            if (words[i].Contains(http) || words[i].Contains(www))
            {
                Console.WriteLine(words[i]);
            }
        }
    }
}
