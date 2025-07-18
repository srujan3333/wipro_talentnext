package java_wrapper;

class Employee implements Cloneable {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class wrapper4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Hari", 50000);
        Employee empClone = emp1.clone();

        System.out.println("Before changing original:");
        System.out.print("Original: ");
        emp1.display();
        System.out.print("Clone   : ");
        empClone.display();

        emp1.setId(102);
        emp1.setName("Ravi");
        emp1.setSalary(60000);

        System.out.println("\nAfter changing original:");
        System.out.print("Original: ");
        emp1.display();
        System.out.print("Clone   : ");
        empClone.display();
    }
}
