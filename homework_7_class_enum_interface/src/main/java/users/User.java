package users;

public class User {

    private String name;
    private Profession profession;
    private int workExperience;

    public User(String name, Profession profession, int workExperience) {
        this.name = name;
        this.profession = profession;
        this.workExperience = workExperience;
    }

    public Double getUserSalary() {
        return (1000 * workExperience * profession.getCoefficient());
    }

    public Double getUserSalaryWithBonus() {
        return (getUserSalary() + profession.getBonus());
    }

    public String getUserInfoWithoutBonus() {
        return "Profession: " + profession + "; name: " + name + "; salary: " + getUserSalary();
    }

    public String getUserInfoWithBonus() {
        return "Profession: " + profession + "; name: " + name + "; salary + bonus: " + getUserSalaryWithBonus();
    }
}