using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

public class Problem02
{
    static void Main()
    {
        // Input
        string input = Console.ReadLine();
        // If the input is Null -> stop the execution of the program with the message provided below
        if (input == "")
        {
            Console.WriteLine(
                "OddSum=No, OddMin=No, OddMax=No, EvenSum=No, EvenMin=No, EvenMax=No");
            return;
        }

        string[] arrayOfNumbers = input.Split(' ');

        List<decimal> oddElements = new List<decimal>();
        List<decimal> evenElements = new List<decimal>();

        decimal sumOddElements = 0;
        decimal sumEvenElements = 0;

        // Main Logic
        for (int i = 0; i < arrayOfNumbers.Length; i++)
        {
            decimal number = 0;
            number = Decimal.Parse(arrayOfNumbers[i]);    
            if (i % 2 == 0)
            {
                oddElements.Add(number);
                sumOddElements += number;
            }
            else
            {
                evenElements.Add(number);
                sumEvenElements += number;
            }
        }

        oddElements.Sort();
        evenElements.Sort();

        decimal minOddElement = 0.0m;
        decimal maxOddElement = 0.0m;

        decimal minEvenElement = 0.0m;
        decimal maxEvenElement = 0.0m;

        // Output
        
        if (arrayOfNumbers.Length == 1)
        {
            minOddElement = oddElements[0];
            maxOddElement = oddElements[oddElements.Count - 1];
            Console.WriteLine(
                "OddSum={0}, OddMin={1}, OddMax={2}, EvenSum=No, EvenMin=No, EvenMax=No",
               (double)sumOddElements, (double)minOddElement, (double) maxOddElement);
        }
        else
        {
            minOddElement = oddElements[0];
            maxOddElement = oddElements[oddElements.Count - 1];
            minEvenElement = evenElements[0];
            maxEvenElement = evenElements[evenElements.Count - 1];
            Console.WriteLine(
                "OddSum={0}, OddMin={1}, OddMax={2}, EvenSum={3}, EvenMin={4}, EvenMax={5}",
               (double)sumOddElements, (double)minOddElement, (double) maxOddElement,
             (double)sumEvenElements, (double)minEvenElement, (double) maxEvenElement);
        }
    }
}