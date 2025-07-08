import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Employeestream {
    int id;
    String naame;
    Double salary;
    public Employeestream(int id, String naame, Double salary) {
        this.id = id;
        this.naame = naame;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNaame() {
        return naame;
    }
    public void setNaame(String naame) {
        this.naame = naame;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employeestream{" +
                "id=" + id +
                ", naame='" + naame + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class TestingMain
{
    public static void main(String args[])
    {
        List<Employeestream> employeestream= Arrays.asList(
                new Employeestream(1,"panney",6790.00),
                new Employeestream(2,"sweta",1000.99),
                new Employeestream(4,"rahul kumar",21000.99)
        );
        Map<String ,Double> map=employeestream.stream()
                .collect(Collectors.groupingBy(Employeestream::getNaame,Collectors.averagingDouble(Employeestream::getSalary)));
        map.forEach((naame, salary) ->
                System.out.println("name: "+naame+",Salary:"+salary));
            }

}


