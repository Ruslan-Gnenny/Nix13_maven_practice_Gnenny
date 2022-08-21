package practiceoop;

import java.util.Collection;

public interface M_Abilities {
    void printInfo();
    void calculateModeratorEFF (Moderator m, int countOfSells, int countOfWorkedDays);
    double calculateProductivity (Collection<? extends Moderator> workers);
}