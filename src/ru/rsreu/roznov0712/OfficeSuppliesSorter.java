package ru.rsreu.roznov0712;

import java.util.Collections;
import java.util.List;

public class OfficeSuppliesSorter {
    public static void sortListOfficeSuppliesUsually(List<OfficeSupplies> officeSupplies){
        Collections.sort(officeSupplies);
    }
    public static void sortListOfficeSupplies(List<OfficeSupplies> officeSupplies){
        Collections.sort(officeSupplies,new OfficeSuppliesComparator());
    }

}
