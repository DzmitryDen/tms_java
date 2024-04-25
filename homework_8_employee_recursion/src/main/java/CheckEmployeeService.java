import java.util.List;

public class CheckEmployeeService {

    public void checkEmployee(Director director, String fullName) {

        List<Employee> list = director.getEmployeeUnderControl();

        for (Employee employee : list) {
            if (employee.getFullName().equals(fullName)) {
                System.out.println("Employee EXISTS!!!");
            } else if (employee.getClass() == Director.class) {
                checkEmployee((Director) employee, fullName);
            }
        }
    }
}