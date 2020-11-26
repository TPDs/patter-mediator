package com.company.components;

import java.util.ArrayList;

public class Shower extends Component {

    public Shower(String itemName, ArrayList<ResourceType> type, Action action, int amount) {
        super(itemName, type, action, amount);
    }
}
