package com.company.components;

import java.util.ArrayList;

public class Kitchen extends Component{



    public Kitchen(String itemName, ArrayList<Energy> type, Action action) {
        super(itemName, type, action);
        type.add(new Energy(ResourceType.Water, 20));
        type.add(new Energy(ResourceType.Power, 10));

    }




}
