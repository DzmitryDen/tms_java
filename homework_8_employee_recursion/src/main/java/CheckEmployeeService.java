import java.util.List;

public class CheckEmployeeService {

    public boolean checkEmployee(Director director, String fullName) {

        List<Employee> list = director.getEmployeeUnderControl();

        boolean check = false;

        for (Employee employee : list) {
            if (employee.getFullName().equals(fullName)) {
                check = true;
                return check;
            } else if (employee.getClass() == Director.class) {
              if (checkEmployee((Director) employee, fullName))  {
                  check = true;
                  return check;
              }
            }
        }
        return check;
    }
}