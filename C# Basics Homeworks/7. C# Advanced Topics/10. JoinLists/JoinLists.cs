using System;
using System.Collections.Generic;
using System.Linq;

class JoinLists
{
    static void Main()
    {
        // Input
        string firstLine = Console.ReadLine();
        string secondLine = Console.ReadLine();
        
        string[] firstLineNums = firstLine.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
        string[] secondLineNums = secondLine.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

        List<int> mainList = new List<int>();
        List<int> auxiliaryList = new List<int>();

        //Main Logic
        for (int i = 0; i < firstLineNums.Length; i++)
        {
            auxiliaryList.Add(int.Parse(firstLineNums[i]));
        }
        for (int j = 0; j < secondLineNums.Length; j++)
        {
            auxiliaryList.Add(int.Parse(secondLineNums[j]));
        }

        // Distinct removes all duplicate elements in a collection. 
        // It returns only the distinct elements. 
        // The System.Linq namespace provides this extension method.
        mainList = auxiliaryList.Distinct().ToList();
        
        mainList.Sort();

        // Output
        foreach (var number in mainList)
        {
            Console.Write(number + " ");
        }
        Console.WriteLine();
    }
}
