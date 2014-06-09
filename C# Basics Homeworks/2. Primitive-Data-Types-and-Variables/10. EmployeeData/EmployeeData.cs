using System;

class EmployeeData
{
    static void Main()
    {
        string firstName = "Marko";
        string secondName = "Totev";
        int age = 26;
        char gender = 'M';
        long idNumber = 8306112507;
        long employeeNumber = 27569999;
        Console.WriteLine("First name : {0}\nSecond name : {1}\nAge: {2}, \nGender : {3}\nID Number : {4}\nEmployee Number : {5}"
            , firstName, secondName, age, gender, idNumber, employeeNumber);
    }
}
