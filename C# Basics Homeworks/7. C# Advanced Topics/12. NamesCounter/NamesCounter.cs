using System;

class NamesCounter
{
    static void Main()
    {
        // Input
        string names = Console.ReadLine();
        string[] namesArray = names.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
        Array.Sort(namesArray);

        // In case we would like to work with list 
        // List<string> namesList = namesArray.ToList<string>();

        // Main Logic
        int counter = 1;
        for (int i = 1; i < namesArray.Length; i++)
        {
            if (namesArray[i] == namesArray[i - 1])
            {
                counter++;
            }
            else
            {
                Console.Write("{0} -> {1}\n", namesArray[i - 1], counter);
                counter = 1;
            }
            if (i == namesArray.Length - 1)
            {
                Console.Write("{0} -> {1}", namesArray[i], counter);
            }
        }
        Console.WriteLine();
    }
}
