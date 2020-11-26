package com.company.components;

import java.util.ArrayList;

public class Component {

    private String itemName;
    private ArrayList<Energy> type;
    private Action action;


    public Component(String itemName, ArrayList<Energy> type, Action action) {
        this.itemName = itemName;
        this.type = type;
        this.action = action;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ArrayList<Energy> getType() {
        return type;
    }

    public void setType(ArrayList<Energy> type) {
        this.type = type;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}