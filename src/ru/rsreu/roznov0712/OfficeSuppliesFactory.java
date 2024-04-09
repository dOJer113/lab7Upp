package ru.rsreu.roznov0712;

public class OfficeSuppliesFactory {
    public static OfficeSupplies getOfficeSupplies(int inventoryNumber, String name, Departments department) {
        if (OfficeSuppliesFactory.isValidInventoryNumber(inventoryNumber)){
            return new OfficeSupplies(inventoryNumber,name,department);
        }
        return new OfficeSupplies();
    }

    private static boolean isValidInventoryNumber(int inventoryNumber) {
        return inventoryNumber > 0;
    }
}
