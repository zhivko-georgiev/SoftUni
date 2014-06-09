using System;

class StringsAndObjects
{
    static void Main()
    {
        string firstString = "Hello";
        string secondString = "World";
        object concatenatedString = firstString + " " + secondString;
        string finalString = (string) concatenatedString;
        Console.WriteLine(finalString);
    }
}
