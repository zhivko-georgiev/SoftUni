using System;
using System.Text;

class IsoscelesTriangle
{
    static void Main()
    {
        Console.OutputEncoding = Encoding.UTF8;
        char copyrightSymbol = '\u00A9';
        Console.WriteLine("   {0}", copyrightSymbol);
        Console.WriteLine("  {0} {0}", copyrightSymbol);
        Console.WriteLine(" {0}   {0}", copyrightSymbol);
        Console.WriteLine("{0} {0} {0} {0}", copyrightSymbol);
    }
}
