/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll.system.fop;

/**
 *
 * @author User
 */
// Base Class
public abstract class Employee {
    // REQUIREMENT: 3 Attributes
    protected String name;
    protected int id;
    protected String department;

    // REQUIREMENT: Constructor
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // REQUIREMENT: Method 1 (Abstract - forces overriding)
    public abstract double calculateSalary();

    // REQUIREMENT: Method 2 (Concrete)
    public void displayCommonInfo() {
        System.out.println("--------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + department);
    }
    
    // Getter for Name (Useful for main class)
    public String getName() {
        return name;
    }
}
