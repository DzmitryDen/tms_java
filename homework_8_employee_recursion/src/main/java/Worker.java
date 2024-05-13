public class Worker extends Employee {

    public Worker(String name, String surname, int workExperience) {
        this.name = name;
        this.surname = surname;
        this.workExperience = workExperience;
        this.profession = Profession.WORKER;
    }


    public void printWorkerInfo() {
        System.out.println(getEmployeeInfo());
    }
}
