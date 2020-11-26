package com.company.components;

import java.util.ArrayList;

public class Shower extends Component {


    public Shower(String itemName, ArrayList<Energy> type, Action action) {
        super(itemName, type, action);
        type.add(new Energy(ResourceType.Water, 20));
        type.add(new Energy(ResourceType.Power, 10));
    }
}
