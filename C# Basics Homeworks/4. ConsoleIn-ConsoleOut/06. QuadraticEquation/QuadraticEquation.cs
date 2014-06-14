using System;

class QuadraticEquation
{
    static void Main()
    {
        //a*x^2 + b*x + c = 0
        // Input
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());
        double c = double.Parse(Console.ReadLine());

        // Variant 1. a = 0
        if (a == 0)
        {
            Console.WriteLine("x1 = x2 = {0}", (-(c / b)));
        }

        // Variant 2. b = 0
        else if (b == 0)
        {
            Console.WriteLine("x1 = x2 = {0}", Math.Sqrt((-(c / a))));
        }
        
        // Variant 3. c = 0
        else if (c == 0)
        {
            Console.WriteLine("x1 = 0, x2 = {0}", -(b / a));
        }

        // Variant 4. a, b, c are different than 0
        // We should determine the Discriminant
        else
        {
            double discriminant = (b * b) - (4 * a * c);
            if (discriminant >= 0)
            {
                double sqrtD = Math.Sqrt(discriminant);
                Console.WriteLine("x1 = {0}, x2 = {1}", ((-b - sqrtD) / (2 * a)), ((-b + sqrtD) / (2 * a)));   
            }
            else
            {
                Console.WriteLine("No Real Roots!");
            }
        }
    }
}
