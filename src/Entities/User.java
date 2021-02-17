package Entities;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String username;
    private int points;
    private List<TopicCard> cards;

    public User(int id, String username){
        this.id = id;
        this.username = username;
        this.points = 0;
        this.cards = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public int getPoints(){
        return points;
    }

    public List<TopicCard> getCards(){
        return cards;
    }

    public void updatePoints(){
        points++;
    }

    public void addCard(TopicCard c){
        cards.add(c);
    }

    public void removeCard(){
        int size = cards.size();
        cards.remove(size - 1);
    }

    public TopicCard getCardOnTop(){
        return cards.get(cards.size() - 1);
    }

    public void addPoint(){
        points += 1;
    }

}
