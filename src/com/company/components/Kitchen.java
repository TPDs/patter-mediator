package com.company.components;

import java.util.ArrayList;

public class Kitchen extends Component{

    public Kitchen(String itemName, ArrayList<ResourceType> type, Action action, int amount) {
        super(itemName, type, action, amount);
    }
}
