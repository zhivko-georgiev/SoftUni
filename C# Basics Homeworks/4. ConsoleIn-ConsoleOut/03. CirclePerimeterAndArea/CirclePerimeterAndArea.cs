using System;

class CirclePerimeterAndArea
{
    static void Main()
    {
        // Input
        Console.Write("PLease enter the radius of a circle : ");
        double radius = double.Parse(Console.ReadLine());
        
        // Calculating the area and perimeter of the circle
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        Console.WriteLine("Perimeter : {0:F2}\nArea : {1:F2}", perimeter, area);
    }
}
