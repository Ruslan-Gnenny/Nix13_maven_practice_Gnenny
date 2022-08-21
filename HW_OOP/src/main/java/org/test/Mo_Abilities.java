package org.test;

import java.util.ArrayList;

public interface Mo_Abilities {
    void printInfo();
    void setClientaccess (Client c, int accessValue);
    ArrayList<Product> modifyCatalog (ArrayList<Product> catalog, int index,
                                      String UnitName, String UnitType, String ScopeOfUse );
    ArrayList<Product> deleteUnit (ArrayList<Product> catalog, int index);    
}