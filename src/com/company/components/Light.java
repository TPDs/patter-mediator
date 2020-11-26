package com.company.components;

import java.util.ArrayList;

public class Light extends Component{


    public Light(String itemName, ArrayList<ResourceType> type, Action action, int amount) {
        super(itemName, type, action, amount);
    }
}
