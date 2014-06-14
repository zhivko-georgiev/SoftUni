using System;

class CardChecker
{
    static void Main()
    {
        // Input
        string card = Console.ReadLine();
        int number = 0;

        // Main Logic
        bool result = Int32.TryParse(card, out number);
        if (result)
	    {
            if (number >= 2 && number <= 10)
            {
                Console.WriteLine("YES");
            }
            else
            {
                Console.WriteLine("NO");
            }
	    }
        else
        {
            switch (card.ToUpper())
            {
                case "J": Console.WriteLine("YES"); break;
                case "Q": Console.WriteLine("YES"); break;
                case "K": Console.WriteLine("YES"); break;
                case "A": Console.WriteLine("YES"); break;
                default: Console.WriteLine("NO"); break;
            }
        }
    }
}
