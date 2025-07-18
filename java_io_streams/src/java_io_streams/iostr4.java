package java_io_streams;

import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() { return name; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setDepartment(String department) { this.department = department; }
    public void setDesignation(String designation) { this.designation = designation; }
    public void setSalary(double salary) { this.salary = salary; }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dateOfBirth);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class iostr4 {
    public static void main(String[] args) {
        String filename = "data";
        try {
            Employee emp = new Employee("Hari", new Date(2000 - 1900, 4, 15), "IT", "Developer", 55000);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(emp);
            oos.close();
            System.out.println("Employee object has been serialized to file '" + filename + "'");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            Employee deserializedEmp = (Employee) ois.readObject();
            ois.close();

            System.out.println("\nDeserialized Employee object:");
            deserializedEmp.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
