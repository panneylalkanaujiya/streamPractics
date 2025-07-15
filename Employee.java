import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{id=" + id + ", name=" + name + ", salary=" + salary + "}";
    }
}

 class ThirdHighestSalary
 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 50000),
                new Employee(2, "Alice", 70000),
                new Employee(3, "Bob", 60000),
                new Employee(4, "David", 90000),
                new Employee(5, "Eve", 70000)
        );

        // Find 3rd highest unique salary
        Optional<Double> thirdHighestSalary = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();

        if (thirdHighestSalary.isPresent()) {
            System.out.println("3rd Highest Salary: " + thirdHighestSalary.get());

            // Print employee(s) with 3rd highest salary
            employees.stream()
                    .filter(e -> e.getSalary() == thirdHighestSalary.get())
                    .forEach(System.out::println);
        } else {
            System.out.println("Less than 3 unique salaries available.");
        }
    }
}