using System;

class BonusScore
{
    static void Main()
    {
        // Input
        int score = int.Parse(Console.ReadLine());
        int bonus = 0;

        // Main Logic
        if (score >= 1 && score <= 3)
        {
            bonus = score * 10;
            Console.WriteLine("Score : {0}\nBonus : {1}", score, bonus);
        }
        else if (score >= 4 && score <= 6)
        {
            bonus = score * 100;
            Console.WriteLine("Score : {0}\nBonus : {1}", score, bonus);
        }
        else if (score >= 7 && score <= 9)
        {
            bonus = score * 1000;
            Console.WriteLine("Score : {0}\nBonus : {1}", score, bonus);
        }
        else //if (score <= 0 || score > 9)
        {
            Console.WriteLine("Invalid Score!");
        }
    }
}
