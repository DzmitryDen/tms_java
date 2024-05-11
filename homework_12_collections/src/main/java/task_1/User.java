package task_1;

import java.util.List;

public class User {

    private String name;
    private Integer experience;
    List<Task> tasks;

    public User(String name, Integer experience, List<Task> tasks) {
        this.name = name;
        this.experience = experience;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public Integer getExperience() {
        return experience;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", tasks=" + tasks +
                '}';
    }
}
