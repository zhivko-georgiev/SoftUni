using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

class Problem04
{
    static void Main()
    {
        // Input
        int minWeight = int.Parse(Console.ReadLine());
        int maxWeight = int.Parse(Console.ReadLine());
        int resultsCount = 0;

        char[] letters = new char[] { 'a', 'b', 'c', 'd', 'e' };

        // Main Logic
        for (int i = 0; i < letters.Length; i++)
        {
            for (int j = 0; j < letters.Length; j++)
            {
                for (int k = 0; k < letters.Length; k++)
                {
                    for (int l = 0; l < letters.Length; l++)
                    {
                        for (int m = 0; m < letters.Length; m++)
                        {
                            string word = "" + letters[i] + letters[j] + letters[k] + letters[l] + letters[m];
                            long weight = CalcWeight(word);
                            if (weight >= minWeight && weight <= maxWeight)
                            {
                                if (resultsCount > 0)
                                {
                                    Console.Write(" ");
                                }
                                Console.Write(word);
                                resultsCount++;
                            }
                        }
                    }
                }
            }
        }
        if (resultsCount == 0)
        {
            Console.Write("No");
        }
    }

    static long CalcWeight(string word)
    {
        bool[] used = new bool[(int)'e' + 1];
        long weight = 0;
        int index = 1;
        for (int i = 0; i < word.Length; i++)
        {
            char letter = word[i];
            if (!used[letter])
            {
                weight += index * CalcWeight(letter);
                index++;
                used[letter] = true;
            }
        }
        return weight;
    }

    static int CalcWeight(char letter)
    {
        switch (letter)
        {
            case 'a': return 5;
            case 'b': return -12;
            case 'c': return 47;
            case 'd': return 7;
            case 'e': return -32;
        }
        return 0;
    }
}
