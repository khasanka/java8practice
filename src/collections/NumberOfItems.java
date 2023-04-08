package collections;

import model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberOfItems {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(new Employee(1,"AA",2000L),
                new Employee(2,"BB", 8000L),
                new Employee(3,"CC", 4000L),
                new Employee(4,"DD", 1000L),
                new Employee(5,"DD", 10000L));

        System.out.println("\n============== Sort by salary ==============");
        List<Employee> employeeSortedList = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        employeeSortedList.forEach(a -> System.out.println(a) );

        System.out.println("\n============== find 3rd salary ==============");
        Optional<Employee> thirdEmp = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).skip(2).findFirst();
        System.out.println(thirdEmp.get());




    }

}

