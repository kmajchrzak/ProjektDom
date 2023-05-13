package org.example;

public class Bed {
    public static int daysOfLinenChange;

    public Bed(int daysOfLinenChange) {
        this.daysOfLinenChange = daysOfLinenChange;
    }

    @Override
    public String toString() {
        return "\nBed::: " +
                "days Of Linen Change = " + daysOfLinenChange;
    }

    public Bed() {
    }

    public void setDaysOfLinenChange(int daysOfLinenChange) {
        Bed.daysOfLinenChange = daysOfLinenChange;
    }
}
