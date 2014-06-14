using System;

class DigitAsWord
{
    static void Main()
    {
        // Input
        string input = Console.ReadLine();
        
        // Main Locig
        int digit = 0;
        bool result = Int32.TryParse(input, out digit);
        if (result)
        {
            switch (digit)
            {
                case 1: Console.WriteLine("One"); break;
                case 2: Console.WriteLine("Two"); break;
                case 3: Console.WriteLine("Three"); break;
                case 4: Console.WriteLine("Four"); break;
                case 5: Console.WriteLine("Five"); break;
                case 6: Console.WriteLine("Six"); break;
                case 7: Console.WriteLine("Seven"); break;
                case 8: Console.WriteLine("Eight"); break;
                case 9: Console.WriteLine("Nine"); break;
                default: Console.WriteLine("Not a digit!"); break;
            }
        }
        else
        {
            Console.WriteLine("Not a digit!");
        }
    }
}
