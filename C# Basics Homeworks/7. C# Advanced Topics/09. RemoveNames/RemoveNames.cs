using System;
using System.Collections.Generic;
using System.Linq;

class RemoveNames
{
    static void Main()
    {
        // Input
        string input = Console.ReadLine();
        List<string> names = input.Split(' ').ToList();

        string namesToBeRemoved = Console.ReadLine();
        List<string> equalNames = namesToBeRemoved.Split(' ').ToList();

        // Main Logic
        for (int i = 0; i < equalNames.Count; i++) // The length of this list is constant
        {
            for (int j = 0; j < names.Count; j++) 
            {
                if (names.Contains(equalNames[i]))
                {
                    names.Remove(equalNames[i]);
                }
            }
        }

        // Other Solution
        //for (int i = 0; i < equalNames.Count; i++)
        //{
        //    for (int j = 0; j < names.Count; j++)
        //    {
        //        if (equalNames[i] == names[j])
        //        {
        //            names.RemoveAt(j);
        //            if (j == names.Count)
        //            {
        //                break;
        //            }
        //            if (equalNames[i] == names[j])
        //            {
        //                names.RemoveAt(j);
        //                j--;
        //                continue;
        //            }
        //        }
        //    }
        //}

        // Output
        foreach (var name in names)
        {
            Console.WriteLine(name);
        }
        // Or
        Console.WriteLine(string.Join<string>(" ", names));
    }
}

