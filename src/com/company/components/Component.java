package com.company.components;

import java.util.ArrayList;

public class Component {

    private String itemName;
    private ArrayList<ResourceType> type;
    private Action action;
    private int amount;


    public Component(String itemName, ArrayList<ResourceType> type, Action action, int amount) {
        this.itemName = itemName;
        this.type = type;
        this.action = action;
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ArrayList<ResourceType> getType() {
        return type;
    }

    public void setType(ArrayList<ResourceType> type) {
        this.type = type;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
