using System;

class ZeroSubset
{
    static void Main()
    {
        // Input
        Console.Write("Enter the first number: ");
        int a = int.Parse(Console.ReadLine());

        Console.Write("Enter the second number: ");
        int b = int.Parse(Console.ReadLine());

        Console.Write("Enter the third number: ");
        int c = int.Parse(Console.ReadLine());

        Console.Write("Enter the fourth number: ");
        int d = int.Parse(Console.ReadLine());

        Console.Write("Enter the fifth number: ");
        int e = int.Parse(Console.ReadLine());
        
        int subsetsCounter = 0;
        
        // Main Logic
        // 5 digits ===============================================================================
        if (a + b + c + d + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}|, |{3}|, |{4}|", a, b, c, d, e);
            subsetsCounter++;
        }
        // 4 digits ===============================================================================
        if (b + c + d + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}|, |{3}| ", b, c, d, e);
            subsetsCounter++;
        }
        if (a + c + d + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}|, |{3}| ", a, c, d, e);
            subsetsCounter++;
        }
        if (a + b + d + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}|, |{3}| ", a, b, d, e);
            subsetsCounter++;
        }
        if (a + b + c + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}|, |{3}| ", a, b, c, e);
            subsetsCounter++;
        }
        if (a + b + c + d == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}|, |{3}| ", a, b, c, d);
            subsetsCounter++;
        }
        // 3 digits ===============================================================================
        if (c + d + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", c, d, e);
            subsetsCounter++;
        }
        if (b + d + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", b, d, e);
            subsetsCounter++;
        }
        if (a + d + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", a, d, e);
            subsetsCounter++;
        }
        if (b + c + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", b, c, e);
            subsetsCounter++;
        }
        if (a + c + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", a, c, e);
            subsetsCounter++;
        }
        if (a + b + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", a, b, e);
            subsetsCounter++;
        }
        if (b + c + d == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", b, c, d);
            subsetsCounter++;
        }
        if (a + c + d == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", a, c, d);
            subsetsCounter++;
        }
        if (a + b + d == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", a, b, d);
            subsetsCounter++;
        }
        if (a + b + c == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}|, |{2}| ", a, b, c);
            subsetsCounter++;
        }
        // 2 digits ===============================================================================
        if (d + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", d, e);
            subsetsCounter++;
        }
        if (c + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", c, e);
            subsetsCounter++;
        }
        if (b + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", b, e);
            subsetsCounter++;
        }
        if (a + e == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", a, e);
            subsetsCounter++;
        }
        if (c + d == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", c, d);
            subsetsCounter++;
        }
        if (b + d == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", b, d);
            subsetsCounter++;
        }
        if (a + d == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", a, d);
            subsetsCounter++;
        }
        if (b + c == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", b, c);
            subsetsCounter++;
        }
        if (a + c == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", a, c);
            subsetsCounter++;
        }
        if (a + b == 0)
        {
            Console.WriteLine("The subset whose sum is zero is: |{0}|, |{1}| ", a, b);
            subsetsCounter++;
        }

        // No subsets found
        if (subsetsCounter == 0)
        {
            Console.WriteLine("No subsets whose sum is zero are found!");
        }
    }
}
