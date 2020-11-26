package com.company.components;

import java.util.List;

public class Component {

    private String itemName;
    private ResourceType <List> type;
    private Action action;
    private int amount;


    public Component(String itemName, ResourceType<List> type, Action action, int amount) {
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

    public ResourceType<List> getType() {
        return type;
    }

    public void setType(ResourceType<List> type) {
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
