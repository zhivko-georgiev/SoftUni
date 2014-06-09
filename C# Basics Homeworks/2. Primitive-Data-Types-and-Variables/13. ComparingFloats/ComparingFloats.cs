using System;

class ComparingFloats
{
    static void Main()
    {
        double firstNumber = 5.00000005;
        double secondNumber = 5.00000001;
        bool equalNumbers = false;
        
        if (Math.Abs(firstNumber - secondNumber) <= 0.000001)
        {
            equalNumbers = true;
        }
        
        Console.WriteLine("The numbers : {0} and {1} are equal : {2}", firstNumber, secondNumber, equalNumbers);
    }
}
