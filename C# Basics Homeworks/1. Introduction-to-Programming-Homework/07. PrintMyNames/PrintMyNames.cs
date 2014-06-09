using System;

class PrintMyNames
{
    static void Main()
    {
        Console.OutputEncoding = System.Text.Encoding.UTF8;

        string firstName = "Яжо";
        string secondName = "Секвоев";
        Console.WriteLine("Call me {0} {1}", firstName, secondName);
    }
}
