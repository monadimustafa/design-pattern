package org.enset.Composite;

public class App {
    public static void main(String[] args) {
        Developer dev1 = new Developer(1001, "John Doe", "Frontend Developer");
        Developer dev2 = new Developer(1002, "Jane Smith", "Backend Developer");

        Manager mgr1 = new Manager(2001, "Robert Brown", "Project Manager");

        CompanyDirectory devDirectory = new CompanyDirectory();
        devDirectory.addEmployee(dev1);
        devDirectory.addEmployee(dev2);

        CompanyDirectory mainDirectory = new CompanyDirectory();
        mainDirectory.addEmployee(mgr1);
        mainDirectory.addEmployee(devDirectory);

        mainDirectory.showEmployeeDetails();
    }
}
