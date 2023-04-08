package collections;

import model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(25, 12, 32, 32, 45, 84, 68, 94, 21, 27);

        System.out.println("\n============== find even numbers  ==============");
        List<Integer> evenNum = integerList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);

        System.out.println("\n============== grater Than 50  ==============");
        List<Integer> graterThan50 = integerList.stream().filter(x -> x > 50).collect(Collectors.toList());
        System.out.println(graterThan50);

        List<Employee> empList = Arrays.asList(new Employee(1,"AA",2000L),
                new Employee(2,"BB", 8000L),
                new Employee(3,"CC", 4000L),
                new Employee(4,"DD", 1000L),
                new Employee(5,"DD", 10000L));

        System.out.println("\n============== highest salary emp ==============");
        Employee maxSalaryEmp = empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
        System.out.println(maxSalaryEmp);


        System.out.println("\n============== emp salary > 5000 ==============");
        List<Employee> salaryGraterThan5000 = empList.stream().filter(emp -> emp.getSalary() > 5000).collect(Collectors.toList());
        salaryGraterThan5000.forEach(emp -> System.out.println(emp));

        System.out.println("\n============== count of emp salary > 5000 ==============");
        long empCount = empList.stream().filter(emp -> emp.getSalary() > 5000).count();
        System.out.println(empCount);


    }
}
