import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {

    private List<Employee> employeeUnderControl = new ArrayList<>();

    public List<Employee> getEmployeeUnderControl() {
        return employeeUnderControl;
    }

    public Director(String name, String surname, int workExperience) {
        this.name = name;
        this.surname = surname;
        this.workExperience = workExperience;
        this.profession = Profession.DIRECTOR;
    }

    public void appointEmployeeUnderControl(Employee employee) {
        employeeUnderControl.add(employee);
    }

    public String getEmployeeUnderControlInfo() {

        StringBuilder info = new StringBuilder();

        if (employeeUnderControl.isEmpty()) {
            info = new StringBuilder("___No employees\n");
        } else {
            for (Employee employee : employeeUnderControl) {
                info.append("___");
                info.append(employee.getEmployeeInfo());
                info.append("\n");
            }
        }
        return info.toString();
    }


    public void printDirectorInfo() {
        System.out.println(getEmployeeInfo() + "\n" + "Subordinate:\n" + getEmployeeUnderControlInfo());
    }
}
