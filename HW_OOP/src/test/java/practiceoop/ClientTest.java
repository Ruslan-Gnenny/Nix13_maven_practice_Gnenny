package practiceoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientTest {

    @Test
    void makeOrder() {
        int [] wishes = new int[] {1,3,5};
        Client cl1 = new Client(1, "Tester", "testing", "test@gmail.com", "3454355");
        ArrayList<Product> catalog = new ArrayList<>();
        catalog.add (new Product(1,"rzk-1", "guitar", "115"));
        catalog.add (new Product(2,"rzk-2", "guitar", "225"));
        catalog.add (new Product(3,"rzk-3", "guitar", "335"));
        catalog.add (new Product(4,"rzk-4", "guitar", "445"));
        catalog.add (new Product(5,"rzk-5", "guitar", "555"));
        ArrayList<Product> actual = cl1.MakeOrder(wishes, catalog);
        ArrayList<Product> expected = actual;
        assertEquals(expected, actual);
    }
}