package ru.rsreu.roznov0712;

import java.io.Serializable;

public class OfficeSupplies implements Comparable<OfficeSupplies>, Serializable {
    private int inventoryNumber;
    private String name;
    private Departments department;

    public OfficeSupplies() {

    }

    public OfficeSupplies(int inventoryNumber, String name, Departments department) {
        this.inventoryNumber = inventoryNumber;
        this.name = name;
        this.department = department;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" ").append(inventoryNumber).append(" ").append(department);
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        OfficeSupplies other = (OfficeSupplies) obj;
        return (other.inventoryNumber == this.inventoryNumber) && (other.department == this.department) && (other.name == this.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + inventoryNumber;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        return result;
    }

    @Override
    public int compareTo(OfficeSupplies other) {
        return this.inventoryNumber - other.inventoryNumber;
    }

}
