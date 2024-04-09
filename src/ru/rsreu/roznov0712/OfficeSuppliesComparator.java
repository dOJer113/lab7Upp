package ru.rsreu.roznov0712;

import java.util.Comparator;

public class OfficeSuppliesComparator implements Comparator<OfficeSupplies> {
    @Override
    public int compare(OfficeSupplies o1, OfficeSupplies o2) {
        return o1.getDepartment().compareTo(o2.getDepartment()) * o1.getName().compareTo(o2.getName());
    }
}
