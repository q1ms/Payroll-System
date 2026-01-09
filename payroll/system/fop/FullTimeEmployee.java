/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll.system.fop;

/**
 *
 * @author User
 */
public class FullTimeEmployee extends Employee {
    // REQUIREMENT: 3 Attributes
    private double baseSalary;
    private double bonus;
    private double healthAllowance;

    // REQUIREMENT: Constructor
    public FullTimeEmployee(String name, int id, String department, double baseSalary, double bonus, double healthAllowance) {
        super(name, id, department); // Constructor Chaining
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.healthAllowance = healthAllowance;
    }

    // REQUIREMENT: Overridden Method
    @Override
    public double calculateSalary() {
        return baseSalary + bonus + healthAllowance;
    }

    // REQUIREMENT: Method 2 (Specific to this class)
    public void printTaxEstimate() {
        double tax = calculateSalary() * 0.20; // 20% tax
        System.out.println("Estimated Tax: RM " + tax);
    }
}
