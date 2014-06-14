using System;

class DifferenceBetweenDates
{
    static void Main()
    {
        // Input
        DateTime firstDate = DateTime.Parse(Console.ReadLine());
        DateTime secondDate = DateTime.Parse(Console.ReadLine());

        // Output
        Console.WriteLine("Days between : {0}", CountOfDays(firstDate, secondDate));
    }
    static double CountOfDays(DateTime startDate, DateTime endDate)
    {
        TimeSpan daysBetweenDates = endDate - startDate;
        double result = daysBetweenDates.TotalDays;
        return result;
    }
}
