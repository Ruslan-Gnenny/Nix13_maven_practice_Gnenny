package practiceoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MasterTest {

    @Test
    void calculateModeratorEFF() {
        Moderator man1 = new Moderator(1, "Tester", "testing", "test@gmail.com");
        int countOfSells = 5;
        int countOfWorkedDays = 10;
        Master head = new Master(1, "Kristian", "12345678", "kr@gmail.com");
        head.calculateModeratorEFF(man1, countOfSells, countOfWorkedDays);
        double actual = man1.getEFF();
        double expected = 21;
        assertEquals(expected, actual);
    }

    @Test
    void calculateProductivity() {
        Master head = new Master(1, "Kristian", "12345678", "kr@gmail.com");
        ArrayList<Moderator> workers = new ArrayList<>();
        Moderator man1 = new Moderator(1, "Till", "876545678", "t@gmail.com");
        Moderator man2 = new Moderator(2, "Rihard", "673988", "r@gmail.com");
        Moderator man3 = new Moderator(3, "Kristoph", "4562348765", "k@gmail.com");
        workers.add(man1);
        workers.add(man2);
        workers.add(man3);
        man1.setEFF(21.0);
        man2.setEFF(23.0);
        man3.setEFF(34.0);
        double actual = head.calculateProductivity(workers);

        double expected = 26.0;
        assertEquals(expected, actual);
    }
}