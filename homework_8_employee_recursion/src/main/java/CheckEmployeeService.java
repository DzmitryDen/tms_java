import java.util.List;

public class CheckEmployeeService {

    public boolean checkEmployee(Director director, String fullName) {

        List<Employee> list = director.getEmployeeUnderControl();

        for (Employee employee : list) {
            if (employee.getFullName().equals(fullName)) {
                return true;
            } else if (employee.getClass() == Director.class) {
                checkEmployee((Director) employee, fullName);
            }
        }
        return false;
    }
}