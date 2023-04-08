package flatmap;

import model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapVsFlatMap {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(new Employee(1, "emp1", 10000L, Arrays.asList(123,456)),
                new Employee(2, "emp2", 7200L, Arrays.asList(789,111)),
                new Employee(3, "emp3", 6800L, Arrays.asList(222,333)),
                new Employee(4, "emp4", 4200L,Arrays.asList(444,555)),
                new Employee(5, "emp5", 8900L,Arrays.asList(666,777)));

        System.out.println("\n============== stream().map()  ==============");

        // map() is used to do data transformation, here we can get all the emp names as a list
        List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(nameList);
        // [emp1, emp2, emp3, emp4, emp5]

        // try to get mobile numbers using map()
        List<List<Integer>> mobileLists = empList.stream().map(Employee::getMobileNumbers).collect(Collectors.toList());
        System.out.println(mobileLists);
        // [[123, 456], [789, 111], [222, 333], [444, 555], [666, 777]]

        System.out.println("\n============== stream().flatmap()  ==============");

        // use flatMap() to get this as in one array, flatMap() dose data transformation and flattering as well
        List<Integer> mobileList = empList.stream().flatMap(employee -> employee.getMobileNumbers().stream()).collect(Collectors.toList());
        System.out.println(mobileList);
        //[123, 456, 789, 111, 222, 333, 444, 555, 666, 777]

    }
}
