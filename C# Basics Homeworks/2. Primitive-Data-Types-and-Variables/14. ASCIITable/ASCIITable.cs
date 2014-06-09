using System;
using System.Text;

class ASCIITable
{
    static void Main()
    {
        Console.OutputEncoding = Encoding.UTF8;

        for (int i = 0; i <= 255; i++)
        {
            char symbol = (char) i;
            Console.WriteLine("ASCII symbol {0} and its number {1}", symbol, i);
        }
    }
}
