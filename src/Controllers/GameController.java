package Controllers;

import Entities.Card;
import Entities.TopicCard;
import Entities.User;
import Entities.WildCard;
import UseCaseClasses.DeckManager;
import UseCaseClasses.UserManager;
import UseCaseClasses.WildCardManager;

public class GameController {

    DeckManager deckManager;
    UserManager userManager;
    WildCardManager wildCardManager;

    public GameController(DeckManager deckManager, UserManager userManager){
        this.deckManager = deckManager;
        this.userManager = userManager;
    }

    public void setDeckManager(DeckManager deckManager){
        this.deckManager = deckManager;
    }

    public void setUserManager(UserManager userManager){
        this.userManager = userManager;
    }

    public void playTurn(int turn){
        Card c = deckManager.removeCard();
        handleCard(c, turn);
        int battleIndex = checkBattle(turn);
        while(battleIndex != userManager.getGameSize()){
            int  loser = battle(userManager.getUser(turn), turn, userManager.getUser(battleIndex), battleIndex);
            if(turn != loser){
                turn = loser;
            }
            battleIndex = checkBattle(loser);
        }
    }

    public void handleCard(Card c, int turn){
        if(c.getType() == Card.Type.WildCard){
            wildCardManager.addWildCard((WildCard) c);
        }
        else{
            User u = userManager.getUser(turn);
            u.addCard((TopicCard) c);
        }
    }

    public int checkBattle(int turn){
        User user1 = userManager.getUser(turn);
        for(int i = 0; i < userManager.getGameSize(); i++){
            if(i != turn){
                User user2 = userManager.getUser(i);
                if(user1.getCardOnTop().getColor() == user2.getCardOnTop().getColor()){
                    return i;
                }
            }
        }
        return userManager.getGameSize();
    }

    public int battle(User user1, int user1Id, User user2, int user2Id){
        boolean win = true;
        if(win){
            user1.addPoint();
            user2.removeCard();
            return user2Id;
        }
        else{
            user2.addPoint();
            user1.removeCard();
            return user1Id;
        }
    }

}
