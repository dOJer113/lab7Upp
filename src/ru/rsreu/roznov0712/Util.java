package ru.rsreu.roznov0712;

import java.util.*;

public class Util {

    public static Set<String> getOfficeSuppliesNamesSet(List<OfficeSupplies> officeSupplies) {
        Set<String> officeSuppliesNames = new HashSet<>();
        ListIterator<OfficeSupplies> iterator = officeSupplies.listIterator();

        while (iterator.hasNext()) {
            officeSuppliesNames.add(iterator.next().getName());
        }
        return officeSuppliesNames;
    }

    public static void remove(Set<OfficeSupplies> officeSuppliesSet, Departments departments) {
        Iterator<OfficeSupplies> iterator = officeSuppliesSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getDepartment() == departments) {
                iterator.remove();
            }
        }
    }

    public static boolean is(int inventoryNumber, Map<Integer, OfficeSupplies> officeSuppliesMap) {
        Set<Integer> keySet = officeSuppliesMap.keySet();
        if (keySet.contains(inventoryNumber)) {
            return true;
        }
        return false;
    }

    public static String search(int inventoryNumber, Map<Integer, OfficeSupplies> officeSuppliesMap) {
        if (is(inventoryNumber, officeSuppliesMap)) {
            return "Element" + officeSuppliesMap.get(inventoryNumber).toString();
        }
        return "Element не найден";
    }

    public static Map<Integer, OfficeSupplies> integerOfficeSuppliesMap(List<OfficeSupplies> officeSupplies) {
        ListIterator<OfficeSupplies> iterator = officeSupplies.listIterator();
        Map<Integer, OfficeSupplies> officeSuppliesMap = new HashMap<>();
        while (iterator.hasNext()) {
            OfficeSupplies supplies = iterator.next();
            officeSuppliesMap.put(supplies.getInventoryNumber(), supplies);
        }
        return officeSuppliesMap;
    }


}
