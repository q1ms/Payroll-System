/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payroll.system.fop;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class PayrollSystem {
    public static void main(String[] args) {
        System.out.println("=== COMPANY PAYROLL SYSTEM ===");

        // REQUIREMENT: Object Creation & Polymorphism (Array of Objects)
        ArrayList<Employee> staffList = new ArrayList<>();

        // Create Objects
        FullTimeEmployee boss = new FullTimeEmployee("Alice Tan", 101, "Management", 5000, 1000, 200);
        PartTimeEmployee intern = new PartTimeEmployee("Bob Lee", 102, "IT", 20, 100); // 20 per hour, 100 hours
        FullTimeEmployee manager = new FullTimeEmployee("Charlie", 103, "HR", 4000, 500, 150);

        // Add to list
        staffList.add(boss);
        staffList.add(intern);
        staffList.add(manager);

        // Demonstration of Method 2 for PartTime
        System.out.println("\n[Update Log]");
        intern.addExtraHours(10); // Bob worked 10 more hours

        // REQUIREMENT: Process all using Polymorphism
        System.out.println("\n[Generating Payslips...]");
        for (Employee e : staffList) {
            e.displayCommonInfo(); // From Parent
            System.out.printf("Total Salary: RM %.2f%n", e.calculateSalary()); // Polymorphic call
            
            // Special check: If full time, show tax
            if (e instanceof FullTimeEmployee) {
                ((FullTimeEmployee) e).printTaxEstimate();
            }
        }
    }
}
