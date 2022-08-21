package org.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class Master extends Person implements M_Abilities {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    public Master (int index, String personName, String phoneNumber, String eMail) {
        super(index, personName, phoneNumber, eMail);
        this.setStatusName("Master");
    }
    @Override
    public void printInfo() {
        System.out.println("Information about Master :");
        System.out.println("Master index : " + this.getIndex());
        System.out.println("Master name : " + this.getName());
        System.out.println("Master phone number : " + this.getNumber());
        System.out.println("Master e-mail: " + this.geteMail());
    }


    public void calculateModeratorEFF (Moderator m, int countOfSells, int countOfWorkedDays) {
        m.setEFF(countOfSells*1.8 + countOfWorkedDays*1.2);
    }

    public double calculateProductivity (Collection<? extends Moderator> workers)  {
        double res = 0.0d;
        for (Moderator Person : workers)
            res+=Person.getEFF();
        return res/workers.size();
    }
    @Override
    protected void finalize ()  {
        logger.info ("Master was deleted");
    }
}
