class Employee {
    public void display() {
        System.out.println("Name of the class is employee");
    }
    public void calcsalary() {
        System.out.println("Salary of an employee is 10000");
    }
}

class Engineer extends Employee {
    public void display() {
        super.display();
    }
    public void calcsalary() {
        System.out.println("Salary of an employee is 20000");
    }    
}

public class Engineerdemo {
    public static void main(String[] args) {
        Engineer eng = new Engineer();
        eng.display();
        eng.calcsalary();
    }
}