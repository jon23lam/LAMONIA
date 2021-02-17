package UseCaseClasses;

import Entities.WildCard;

import java.util.ArrayList;
import java.util.List;

public class WildCardManager {

    private List<WildCard> wildCardList;

    public WildCardManager(){
        wildCardList = new ArrayList<>();
    }

    public WildCard getCardOnTop(){
        return wildCardList.get(wildCardList.size() - 1);
    }

    public void addWildCard(WildCard card){
        wildCardList.add(card);
    }

    public int getSize(){
        return wildCardList.size();
    }
}
