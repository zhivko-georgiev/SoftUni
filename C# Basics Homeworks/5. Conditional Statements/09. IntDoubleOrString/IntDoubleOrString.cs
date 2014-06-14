using System;

class IntDoubleOrString
{
    static void Main()
    {
        // Input
        Console.WriteLine("Please select what type will be the input : \n0 for Int \n1 for Double \n2 for String");
        byte choice = byte.Parse(Console.ReadLine());

        // Main Logic
        switch (choice)
        {
            case 0:
                int intChoice = int.Parse(Console.ReadLine());
                Console.WriteLine(intChoice + 1);
                break;
            case 1:
                double doubleChoice = double.Parse(Console.ReadLine());
                Console.WriteLine(doubleChoice + 1);
                break;
            case 2:
                string strChoice = Console.ReadLine();
                Console.WriteLine(strChoice + "*");
                break;
            default:
                Console.WriteLine("You have entered invalid number! You should choose amongst 0, 1 and 2!");
                break;
        }
    }
}
