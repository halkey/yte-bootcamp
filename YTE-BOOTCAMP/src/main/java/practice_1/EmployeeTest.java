package practice_1;

public class EmployeeTest {

    public static void main(String args[]) {
        /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // Invoking methods for each object created
        empOne.setAge(26);
        empOne.setDesignation("Senior Software Engineer");
        empOne.setSalary(1000);
        empOne.printEmployee();

        empTwo.setAge(21);
        empTwo.setDesignation("Software Engineer");
        empTwo.setSalary(500);
        empTwo.printEmployee();
    }
}