using System;
using System.Collections.Generic;

class LettersCounter
{
    static void Main()
    {
        // Input
        string inputString = Console.ReadLine();

        string[] inputStringArray = inputString.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

        List<string> inputList = new List<string>();

        for (int i = 0; i < inputStringArray.Length; i++)
        {
            inputList.Add(inputStringArray[i]);
        }

        // Main Logic
        inputList.Sort();
        int counter = 1;
        for (int i = 1; i < inputList.Count; i++)
        {
            if (inputList[i] == inputList[i - 1])
            {
                counter++;
            }
            else
            {
                Console.Write("{0} -> {1} times\n", inputList[i - 1], counter);
                counter = 1;
            }
            if (i == inputList.Count - 1)
            {
                Console.Write("{0} -> {1} times", inputList[i], counter);
            }
        }
        Console.WriteLine();
    }
}
