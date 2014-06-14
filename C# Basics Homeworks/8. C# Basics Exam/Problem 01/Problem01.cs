using System;
using System.Globalization;


class Problem01
{
    static void Main()
    {
        // Input
        int startHour = int.Parse(Console.ReadLine());
        int startMinutes = int.Parse(Console.ReadLine());

        string timeDesignator = Console.ReadLine();
        string startExam = startHour + ":" + startMinutes + " " + timeDesignator;

        int endHour = int.Parse(Console.ReadLine());
        int endMinutes = int.Parse(Console.ReadLine());

        // Main Logic
        // Parsing the input
        DateTime start = DateTime.Parse(startExam);
        DateTime startPlusEndHour = start.AddHours(endHour);
        DateTime startPlusEndHourPlusMinutes = startPlusEndHour.AddMinutes(endMinutes); 
      
        // Output
        string format = "hh:mm:tt";
        Console.WriteLine(startPlusEndHourPlusMinutes.ToString(format, CultureInfo.InvariantCulture));
    }
}

