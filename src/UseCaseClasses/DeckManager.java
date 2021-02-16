package UseCaseClasses;

import Entities.Card;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class DeckManager {

    private List<Card> deck;

    public DeckManager(List<Card> deck){
        this.deck = deck;
    }

    public void shuffle(){
        List<Card> copy = new ArrayList<>();
        int index;
        while(!deck.isEmpty()){
            index = (int)(Math.random() * deck.size());
            copy.add(deck.remove(index));
        }
        deck = copy;
    }

    public Card removeCard(){
        return deck.remove(deck.size() - 1);
    }

}
