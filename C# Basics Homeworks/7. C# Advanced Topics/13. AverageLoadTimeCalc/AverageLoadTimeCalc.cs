using System;
using System.Collections.Generic;
using System.Linq;

class AverageLoadTimeCalc
{
    static void Main()
    {
        // Input
        Console.WriteLine("Write next report: ");
        string line = Console.ReadLine();

        Dictionary<string, double> sites = new Dictionary<string, double>();
        Dictionary<string, int> counters = new Dictionary<string, int>();
        
        // Main Logic
        while (line != string.Empty)
        {
            string[] list = line.Split(' ');
            string link = list[2];
            double loadTime = double.Parse(list[3]);

            if (!sites.Keys.Contains(link))
            {
                sites[link] = loadTime; 
                counters.Add(link, 1);
            }
            else
            {
                counters[link] += 1;
                sites[link] = sites[link] + loadTime;
            }
            Console.WriteLine("Write line:");
            line = Console.ReadLine();
        }

        // Output
        foreach (string link in sites.Keys)
        {
            Console.WriteLine("{0} -> {1:F7}", link, sites[link] / counters[link]);
        }
    }
}
