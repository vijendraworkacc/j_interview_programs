package com.javadevta.dp;

import java.time.LocalDate;

class Employee {
    private String id;
    private String name;
    private LocalDate dateOfJoining;
    private int age;
    private LocalDate dateOfBirth;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String empId, String empName, LocalDate empDOJ, int empAge, LocalDate empDOB, double empSalary) {
        super();
        this.id = empId;
        this.name = empName;
        this.dateOfJoining = empDOJ;
        this.age = empAge;
        this.dateOfBirth = empDOB;
        this.salary = empSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + id + ", empName=" + name + ", empDOJ=" + dateOfJoining + ", empAge=" + age
                + ", empDOB=" + dateOfBirth + ", empSalary=" + salary + "]";
    }

}

class EmployeeBuilder {
    private String id;
    private String name;
    private LocalDate dateOfJoining;
    private int age;
    private LocalDate dateOfBirth;
    private double salary;

    public EmployeeBuilder() {
        super();
    }

    public EmployeeBuilder empId(String empId) {
        this.id = empId;
        return this;
    }

    public EmployeeBuilder empName(String empName) {
        this.name = empName;
        return this;
    }

    public EmployeeBuilder empDOJ(LocalDate empDOJ) {
        this.dateOfJoining = empDOJ;
        return this;
    }

    public EmployeeBuilder empAge(int empAge) {
        this.age = empAge;
        return this;
    }

    public EmployeeBuilder empDOB(LocalDate empDOB) {
        this.dateOfBirth = empDOB;
        return this;
    }

    public EmployeeBuilder empSalary(double empSalary) {
        this.salary = empSalary;
        return this;
    }

    public Employee build() {
        return new Employee(this.id, this.name, this.dateOfJoining, this.age, this.dateOfBirth, this.salary);
    }
}

public class TryBuilder {
    public static void main(String[] args) {
        System.out.println("main(...) start!");
        Employee employee01 = new Employee("Ty001", "Name01", LocalDate.of(2019, 8, 22), 22, LocalDate.of(1999, 8, 22),
                24000);

        Employee employee02 = new EmployeeBuilder()
                .empAge(21)
                .empDOB(LocalDate.of(1999, 8, 22))
                .empDOJ(LocalDate.of(2019, 8, 22))
                .empName("Name02")
                .build();

        System.out.println(employee02);
        System.out.println("main(...) ends!");
    }
}
