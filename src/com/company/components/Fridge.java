package com.company.components;

import java.util.ArrayList;

public class Fridge extends Component{

    public Fridge(String itemName, ArrayList<ResourceType> type, Action action, int amount) {
        super(itemName, type, action, amount);
    }
}
