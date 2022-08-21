package practiceoop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        log.warn("starting");
        Client cl1 = new Client(1, "Till", "876545678", "t@gmail.com", "98765");
        Client cl2 = new Client(2, "Rihard", "673988", "r@gmail.com", "98765456");
        Client cl3 = new Client(3, "Kristoph", "4562348765", "k@gmail.com", "987678765");

        ArrayList<Moderator> workers = new ArrayList<>();
        Moderator man1 = new Moderator(1, "Paul", "098765", "paul@gmail.com");
        


        Master head = new Master(1, "Kristian", "12345678", "kr@gmail.com");

        ArrayList <Product> catalog = new ArrayList<>();
        catalog.add (new Product(1,"rzk-1", "guitar", "115"));
        catalog.add (new Product(2,"rzk-2", "guitar", "225"));
        catalog.add (new Product(3,"rzk-3", "guitar", "335"));
        catalog.add (new Product(4,"rzk-4", "guitar", "445"));
        catalog.add (new Product(5,"rzk-5", "guitar", "555"));


        catalog = man1.deleteUnit(catalog,4);
        catalog = man1.modifyCatalog(catalog, 6, "rzk-6", "guitar", "665");

        System.out.println("catalog after Moderator changes:");
        for (Product unit : catalog) {
            unit.printInfoAboutProduct();
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
        }

        System.out.println("Order (made by cl1) : ");
        int [] wishes = new int [] {1,2,3};
        ArrayList<Product> order = cl1.MakeOrder(wishes, catalog);
        for (Product unit : order) {
            unit.printInfoAboutProduct();
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
        }

        man1.setClientaccess(cl1, 5);
        cl1.printInfo();

        head.calculateModeratorEFF(man1,5, 4);

        workers.add(man1);


        System.out.println("Total EFF : " + head.calculateProductivity(workers));

        cl1 = null;
        cl2 = null;
        cl3 = null;
        System.gc();
        man1 = null;
        System.gc();
        head = null;
        System.gc();
    }
}