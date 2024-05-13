public abstract class Employee {

    String name;
    String surname;
    int workExperience;
    Profession profession;

    String getFullName() {
        return name + " " + surname;
    }

    public String getEmployeeInfo() {
        return ("Full name: " + getFullName() + ";\n" + "Experience: " + workExperience +
                ";\n" + "Profession: " + profession + ";");
    }
}