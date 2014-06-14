using System;

class BiggestOf5Numbers
{
    static void Main()
    {
        // Input
        Console.Write("Please enter the first number : ");
        double firstNumber = double.Parse(Console.ReadLine());

        Console.Write("PLease enter the second number : ");
        double secondNumber = double.Parse(Console.ReadLine());

        Console.Write("PLease enter the third number : ");
        double thirdNumber = double.Parse(Console.ReadLine());

        Console.Write("PLease enter the fourth number : ");
        double fourthNumber = double.Parse(Console.ReadLine());

        Console.Write("PLease enter the fifth number : ");
        double fifthNumber = double.Parse(Console.ReadLine());

        // Main Logic
        double greatestNumber = firstNumber;
        if (greatestNumber < secondNumber)
        {
            greatestNumber = secondNumber;
        }
        if (greatestNumber < thirdNumber)
        {
            greatestNumber = thirdNumber;
        }
        if (greatestNumber < fourthNumber)
        {
            greatestNumber = fourthNumber;
        }
        if (greatestNumber < fifthNumber)
        {
            greatestNumber = fifthNumber;
        }
        Console.WriteLine("The greatest variable is: {0}", greatestNumber);
    }

    ////Using Arrays and For Loop
    //static void Main()
    //{
    //    Console.Write("Enter the numbers count:");
    //    int readCount = int.Parse(Console.ReadLine());
    //    double[] numbersArr = new double[readCount];

    //    for (int i = 0; i < readCount; i++)
    //    {
    //        Console.Write("Number {0}: ", i + 1);
    //        numbersArr[i] = double.Parse(Console.ReadLine());
    //    }
    //    Array.Sort(numbersArr);
    //    Console.WriteLine("The Greatest number is: {0}", numbersArr[readCount - 1]);
    //}
}
