package practiceoop;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Moderator extends Person implements Mo_Abilities {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    private double EFF = 100;

    public Moderator (int index, String personName, String phoneNumber, String eMail) {
        super(index, personName, phoneNumber, eMail);
        this.setStatusName("Moderator");
    }
    @Override
    public void printInfo() {
        System.out.println("Information about Moderator:");
        System.out.println("Moderator index : " + this.getIndex());
        System.out.println("Moderator name : " + this.getName());
        System.out.println("Moderator phone number : " + this.getNumber());
        System.out.println("Moderator e-mail : " + this.geteMail());
        System.out.println("Moderator current EFF : " + this.getEFF());
    }



    double getEFF () {
        return this.EFF;
    }

    void setEFF (double EFFValue) {
        this.EFF = EFFValue;
    }

    public void setClientaccess(Client c, int accessValue) {
        c.setaccess(accessValue);
    }
    public ArrayList<Product> modifyCatalog (ArrayList<Product> catalog, int index,
                                                      String UnitName, String UnitType, String ScopeOfUse ) {
        catalog.add(new Product(index, UnitName, UnitType, ScopeOfUse));
        return catalog;
    }

    @Override
    public ArrayList<Product> deleteUnit(ArrayList<Product> catalog, int index) {
        for (Product unit : catalog)
            if (unit.getProductIndex() == index)
                catalog.remove (index-1);
        return catalog;
    }

    /*public ArrayList<Product> deleteUnit(ArrayList<Product> catalog, int index) {
        for (Product unit : catalog)
            if (unit.getProductIndex() == index)
                catalog.remove (index-1);
        return catalog;
    }
     */
    @Override
    protected void finalize ()  {
        logger.info ("Moderator was deleted");
    }
}
