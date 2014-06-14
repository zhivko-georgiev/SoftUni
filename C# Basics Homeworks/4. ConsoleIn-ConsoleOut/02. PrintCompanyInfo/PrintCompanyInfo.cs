using System;

class PrintCompanyInfo
{
    static void Main()
    {
        // Company's information
        Console.Write("Company's name : ");
        string companyName = Console.ReadLine();

        Console.Write("Company's address : ");
        string companyAddress = Console.ReadLine();

        Console.Write("Company's phone : ");
        string companyPhone = Console.ReadLine();

        Console.Write("Company's fax number : ");
        string companyFaxNumber = Console.ReadLine();

        Console.Write("Company's website : ");
        string companyWebsite = Console.ReadLine();

        // Manager's information
        Console.Write("Manager's first name : ");
        string managerFirstName = Console.ReadLine();

        Console.Write("Manager's second name : ");
        string managerSecondName = Console.ReadLine();

        Console.Write("Manager's age : ");
        string managerAge = Console.ReadLine();

        Console.Write("Manager's telephone : ");
        string managerPhone = Console.ReadLine();

        // Final Output
        Console.WriteLine("{0}\nAddress : {1}\nTel. {2}\nFax : {3}\nWeb Site : {4}",
            companyName, companyAddress, companyPhone, companyFaxNumber, companyWebsite);
        Console.WriteLine("Manager : {0} {1} (age : {2}, tel. {3})", managerFirstName, managerSecondName, managerAge, managerPhone);
    }
}
