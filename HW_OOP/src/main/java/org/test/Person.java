package org.test;

public abstract class  Person {
    private int index;
    private String Name;
    private String Phone;
    private String eMail;
    private String statusName = "Person";

    Person (int index, String personName, String phoneNumber, String eMail) {
        this.index = index;
        this.Name = personName;
        this.Phone = phoneNumber;
        this.eMail = eMail;
    }

    public abstract void  printInfo();

    void setIndex (int index) {
        this.index = index;
    }
    void setPersonName (String personName) {
        this.Name = personName;
    }
    void setPhoneNumber (String phoneNumber) {
        this.Phone = phoneNumber;
    }
    void setStatusName (String statusName) {
        this.statusName = statusName;
    }
    int getIndex () {
        return this.index;
    }
    String getName () {
        return this.Name;
    }
    String getNumber() {
        return this.Phone;
    }
    String getStatusName () {
        return this.statusName;
    }
    String geteMail () {
        return this.eMail;
    }
}
