package ru.rsreu.roznov0712;

import com.prutzkow.resourcer.ProjectResourcer;
import com.prutzkow.resourcer.Resourcer;

import java.util.Iterator;
import java.util.Set;

public class TablePrinter {
    //todo Добавить метод для вывод мапы и листа
    private static Resourcer resourcer = ProjectResourcer.getInstance();
    public static String printTable(OfficeSupplies[] suppliesArray) {

        StringBuilder tableBuilder = new StringBuilder();

        tableBuilder.append(resourcer.getString("table")).append("\n");
        tableBuilder.append("|------------------|------------------|------------------|\n");

        for (OfficeSupplies supply : suppliesArray) {
            tableBuilder.append(String.format("| %-16d | %-16s | %-16s |\n", supply.getInventoryNumber(), supply.getName(), supply.getDepartment()));
        }
        return tableBuilder.toString();

    }
    public static String printOfficeSuppliesNamesSet(Set<String> officeSuppliesNames){
        StringBuilder tableBuilder = new StringBuilder("|------Names------|");
        tableBuilder.append("|-----------------|");
        Iterator<String> setIterator = officeSuppliesNames.iterator();
        while (setIterator.hasNext()){
            tableBuilder.append(String.format("| %-18s |\n",setIterator.next()));
        }
        return tableBuilder.toString();
    }
}
