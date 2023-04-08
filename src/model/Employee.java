package model;

import java.util.List;

public class Employee {

    private int id;
    private String name;
    private Long salary;

    private List<Integer> mobileNumbers;

    public Employee() {
    }

    public Employee(int id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name, Long salary, List<Integer> mobileNumbers) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.mobileNumbers = mobileNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public List<Integer> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<Integer> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", mobileNumbers=" + mobileNumbers +
                '}';
    }
}
