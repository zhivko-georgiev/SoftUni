using System;

class AgeAfter10Years
{
    static void Main()
    {
        Console.Write("PLease enter your current age : ");
        int age = int.Parse(Console.ReadLine());
        Console.WriteLine("Now you are {0} years old. After 10 years you will be {1} years old.", age, age + 10);
    }
}
