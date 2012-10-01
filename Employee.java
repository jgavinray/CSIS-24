public class Employee
{
    // Data declarations section
    
    private static int numEmployees;
    private static double taxRate = 0.025;
    private int idNum;
    private static double hourlyRate;   // Added by me - Wohoo!  Make that money!
    
    public Employee(int num, double rate) // Constructor // Also added rate of pay
    {
        idNum = num;
        hourlyRate = rate;
        numEmployees++; // Add one to the employee count
    }
    
    public void showValues()
    {
        System.out.println("Employee number " + idNum + " has a tax rate of " + taxRate + " and earns $" + hourlyRate + " hourly.\n");  // Added hourly rate
    }
    
    public static void main(String[] args)
    {
        System.out.println("The value in numEmployees is " + numEmployees);
        System.out.println("The tax rate for all employees is " + taxRate + '\n');
        
        Employee BSMITH = new Employee(11122, 25.37);
        System.out.println("The numer of employees is now " + numEmployees);
        BSMITH.showValues();
        
        Employee JJONES = new Employee(11133, 35.12);
        System.out.println("The number of employees is now " + numEmployees);
        JJONES.showValues();
    }
}