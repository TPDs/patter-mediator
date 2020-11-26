package com.company.components;

import java.util.ArrayList;

public class Fridge extends Component{


    public Fridge(String itemName, ArrayList<Energy> type, Action action) {
        super(itemName, type, action);
        type.add(new Energy(ResourceType.Power, 45));
    }
}
