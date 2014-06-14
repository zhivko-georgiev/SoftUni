using System;
using System.Globalization;
using System.Threading;

class BeerTime
{
    static void Main()
    {
        // Input
        CultureInfo enUS = new CultureInfo("en-US");
        DateTime time;
        DateTime startTime = DateTime.Parse("1:00 PM");
        DateTime endTime = DateTime.Parse("3:00 AM");
        string dateString = Console.ReadLine();

        // Main Logic
        if (DateTime.TryParseExact(dateString, "h:mm tt", enUS,
                                    DateTimeStyles.None, out time))
        {
            if (time >= startTime || time <= endTime)
            {
                Console.WriteLine("Beer Time");
            }
            else
            {
                Console.WriteLine("Non-Beer Time");
            }
        }
        else
        {
            Console.WriteLine("Invalid Time");
        }
    }
}