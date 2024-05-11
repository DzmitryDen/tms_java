package task_1;

import java.util.Comparator;

public class UserExperienceComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o2.getExperience() - o1.getExperience();
    }
}
