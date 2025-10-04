package Employee_salary_package;

class Employee {
    private String  name;
    private double baseSalary;

    public Employee(String name,double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){
        return baseSalary;
    }

    public String getName(){
        return name;
    }
}

class Manager extends Employee{
    private double bonus;

    Manager(String name, double baseSalary,double bonus){
        super(name,baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus ;
    }
}

public class HRApp{
    public static void main (String[] args){
        Employee regularEmp = new Employee("Alice", 50000.0);
        Manager teamManager = new Manager("Bob", 80000.0, 15000.0);

        System.out.println(regularEmp.getName() + "'s Salary: $" + regularEmp.calculateSalary());
        // Output: Alice's Salary: $50000.0

        System.out.println(teamManager.getName() + "'s Salary: $" + teamManager.calculateSalary());
        // Output: Bob's Salary: $95000.0

    }
}
