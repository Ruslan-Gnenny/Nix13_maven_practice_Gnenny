package org.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Client  extends Person implements C_Abilities {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    private String IPN;
    private int access = 1;

    Client (int index, String Name, String Number,String eMail, String IPN) {
        super(index, Name, Number,eMail);
        this.setStatusName("Client");
        this.IPN = IPN;
        logger.info ("New client was created");
    }

    @Override
    public void printInfo() {
        System.out.println("Information about client:");
        System.out.println("Client index : " + this.getIndex());
        System.out.println("Client name : " + this.getName());
        System.out.println("Client phone number : " + this.getNumber());
        System.out.println("Client e-mail : " + this.geteMail());
        System.out.println("Client access value : " + this.access);
    }

    int getaccess () {
        return this.access;
    }
    void setaccess (int accessValue) {
        this.access = accessValue;
        logger.info ("New access value was set. Client with index : " + this.getIndex() + "| Address : " + this);
    }
    String getIPN () {
        return IPN;
    }
    void setIPN (String IPNValue) {
        this.IPN = IPNValue;
        logger.info ("new IPN value was set. Client with index : " + this.getIndex() + "| Address : " + this);
    }

    public ArrayList<Product> MakeOrder (int [] wishes, ArrayList<Product> catalog) {
        ArrayList<Product> order = new ArrayList<>();
        for (int i : wishes)
            for (Product unit : catalog)
                if (unit.getProductIndex()==i)
                    order.add(unit);
        return order;
    }
    @Override
    protected void finalize ()  {
        logger.info ("Client was deleted");
    }
}
