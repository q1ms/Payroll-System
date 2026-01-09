/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll.system.fop;

/**
 *
 * @author User
 */
public class PartTimeEmployee extends Employee {
    // REQUIREMENT: 3 Attributes
    private double hourlyRate;
    private int hoursWorked;
    private double overtimeMultiplier;

    // REQUIREMENT: Constructor
    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeMultiplier = 1.5; // Standard overtime rate
    }

    // REQUIREMENT: Overridden Method
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // REQUIREMENT: Method 2 (Specific to this class)
    public void addExtraHours(int hours) {
        this.hoursWorked += hours;
        System.out.println(hours + " extra hours added. Total: " + this.hoursWorked);
    }
}