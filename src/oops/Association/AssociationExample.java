package oops.Association;

public class AssociationExample {

    // Main driver mmethod
    public static void main(String[] args) {

        // Creating objects of bank and Sorting.JavaHungry.Employee.JavaHungry.Employee class
        Bank bank = new Bank("RBI");
        Employee emp = new Employee("ROB");

        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp.getEmployeeName()
                + " is employee of "
                + bank.getBankName());
    }
}

class Bank {

    // Attribures of bank
    private String name;

    // Constructor of this class
    Bank(String name) {
        // this keyword refers to current instance itself
        this.name = name;
    }

    // Method of Bank class
    public String getBankName() {
        // Returning name of bank
        return this.name;
    }
}

// Class 2
// Sorting.JavaHungry.Employee.JavaHungry.Employee class
class Employee {
    // Attribures of employee
    private String name;

    // Sorting.JavaHungry.Employee.JavaHungry.Employee name
    Employee(String name) {
        // This keyword refwrs to current insytance itself
        this.name = name;
    }

    // Method of Sorting.JavaHungry.Employee.JavaHungry.Employee class
    public String getEmployeeName() {
        // returning the name of employee
        return this.name;
    }
}