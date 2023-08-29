package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Menu {

    private  ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem (MenuItem menuItem){
        menuItems.add(menuItem);
    }

    public void printMenu(){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd ");
        System.out.println("\n=====================\n   Restaurant Menu\n\t "+ ft.format(date)+"\n=====================\n");
        for(MenuItem menuItem : menuItems){
            if(menuItem.isAvailable()){
                System.out.println(menuItem.getMenuItem());
            }
        }
    }
}