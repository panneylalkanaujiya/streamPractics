import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {
    int id;
    String name;
    Double Salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return Salary;
    }

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
class MainEmployee
{
    public static void main(String args[])
    {
        List<Employee>employee= Arrays.asList( new Employee(1,"panneylal",234000.00),
                new Employee(2,"sweta",45000.9),
                new Employee(3,"pradeep",4500.00),
                new Employee(4,"Archana",12000.98)
        );
        Map<Double,Long> map=employee.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting()));
        System.out.println("map:"+map);
    }
}
