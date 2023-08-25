package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private final List<MenuItem> items;
    private Date lastUpdated;

    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdated = new Date(); // Initialize with the current date and time
    }

    public void addItem(MenuItem item) {
        items.add(item);
        lastUpdated = new Date(); // Update the lastUpdated field when an item is added
    }
    public Date getLastUpdated() {
        return lastUpdated;
        // Getters for items and lastUpdated
    }
}
