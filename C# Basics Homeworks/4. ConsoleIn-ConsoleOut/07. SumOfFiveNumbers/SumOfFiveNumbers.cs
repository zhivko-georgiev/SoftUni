using System;
using Nakov.IO;

class SumOfFiveNumbers
{
    static void Main()
    {
        //using Nakov.IO

        // Input
        double firstNumber = Cin.NextDouble();
        double secondNumber = Cin.NextDouble();
        double thirdNumber = Cin.NextDouble();
        double fourthNumber = Cin.NextDouble();
        double fifthNumber = Cin.NextDouble();

        // Output
        double sum = (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber);
        Console.WriteLine(sum);
     }
}

