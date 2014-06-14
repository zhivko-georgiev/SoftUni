using System;

class Program
{
    static void Main()
    {
        // Input
        Console.Write("Enter first number: ");
        double firstnumber = double.Parse(Console.ReadLine());

        Console.Write("Enter second number: ");
        double secondnumber = double.Parse(Console.ReadLine());

        Console.Write("Enter third number: ");
        double thirdnumber = double.Parse(Console.ReadLine());

        // Main Logic
        if (firstnumber > secondnumber)
        {
            if (firstnumber > thirdnumber)
            {
                if (secondnumber > thirdnumber)
                {
                    Console.WriteLine("{0}\n{1}\n{2}", firstnumber, secondnumber, thirdnumber);
                }
                else
                {
                    Console.WriteLine("{0}\n{1}\n{2}", firstnumber, thirdnumber, secondnumber);
                }
            }
            else
            {
                Console.WriteLine("{0}\n{1}\n{2}", thirdnumber, firstnumber, secondnumber);
            }
        }
        else if (secondnumber > thirdnumber)
        {
            if (firstnumber > thirdnumber)
            {
                Console.WriteLine("{0}\n{1}\n{2}", secondnumber, firstnumber, thirdnumber);
            }
            else
            {
                Console.WriteLine("{0}\n{1}\n{2}", secondnumber, thirdnumber, firstnumber);
            }
        }
        else
        {
            Console.WriteLine("{0}\n{1}\n{2}", thirdnumber, secondnumber, firstnumber);
        }
    }
}
