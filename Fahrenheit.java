// J. Gavin Ray
// Exercise 3.2 #5

public class Fahrenheit
{
    private double fahrenheit;
    private double celsius;

    public void Fahrenheit()                // Constructor
    {
        fahrenheit  = 32;
    }
    
    public void setFahrenheit(double temp)     // Mutator
    {
        fahrenheit = temp;
    }
    
    public void calculateCelsius()          // Calculator
    {
        celsius = (fahrenheit - 32) * 5.0/9.0;
    }
        
    public void showCelsius()
    {
        System.out.println("Tempature in celsius\t=\t" + celsius);
    }
    
    public void showFahrenheit()
    {
        System.out.println("Tempature in fahrenheit\t=\t" + fahrenheit);
    }
 
    public static void main(String[] args)
    {
        double tempature = 32;
        Fahrenheit newOne;
        newOne = new Fahrenheit();
        
        newOne.setFahrenheit(tempature);
        newOne.calculateCelsius();
        newOne.showCelsius();
    }
    
}
