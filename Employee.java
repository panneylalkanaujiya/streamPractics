import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//write a program to find the salary on the bases of different city
public class Employee {
    int id;
    String name;
    Double salary;

    public Employee(String name, int id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
  class EmployeeMain
 {
     public static  void main(String args[])
     {
         List<Employee> employee= Arrays.asList(
                 new Employee("panney",12,2200.00),
                 new Employee("ankit",24,23000.00),
                 new Employee("Rahul",25,25000.00),
                 new Employee("sweta",74,293000.00),
                 new Employee("Rohit",84,29000.00));
         Map<Double,Long> findsalary=employee.stream()
                 .collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting()));
     System.out.println("findsalary:"+findsalary);
     }
 }