package practiceoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModeratorTest {

    @Test
    void setClientaccess() {
        Client cl1 = new Client(1, "Kristoph", "4562348765", "k@gmail.com", "987678765");
        Moderator man1 = new Moderator(1, "Rihard", "673988", "r@gmail.com");
        man1.setClientaccess(cl1,3);
        int actual = cl1.getaccess();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void modifyCatalog() {
        Moderator man1 = new Moderator(1, "Kristoph", "4562348765", "k@gmail.com");
        ArrayList<Product> catalog = new ArrayList<>();
        catalog.add (new Product(1,"something1", "something2", "something3"));
        catalog.add (new Product(2,"something1", "something2", "something3"));
        catalog.add (new Product(3,"something1", "something2", "something3"));
        catalog.add (new Product(4,"something1", "something2", "something3"));
        catalog.add (new Product(5,"something1", "something2", "something3"));
        man1.modifyCatalog(catalog, 345,"something1", "something2", "something3");
        boolean actual = false;
        for (Product i : catalog) {
            if (i.getProductIndex() == 345)
                actual = true;
        }
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void deleteUnit() {
        Moderator man1 = new Moderator(1, "Kristoph", "4562348765", "k@gmail.com");
        ArrayList<Product> catalogBefore = new ArrayList<>();
        ArrayList<Product> catalogAfter;
        catalogBefore.add (new Product(1,"something1", "something2", "something3"));
        catalogBefore.add (new Product(2,"something1", "something2", "something3"));
        catalogAfter = man1.deleteUnit(catalogBefore, 1);
        boolean actual = true;
        for (Product i : catalogAfter) {
            if (i.getProductIndex() == 1)
                actual = false;
        }
        boolean expected = true;
        assertEquals(expected, actual);
    }
    }