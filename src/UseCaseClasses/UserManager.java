package UseCaseClasses;

import Entities.User;
import Exceptions.CapacityException;

import java.util.List;

public class UserManager {

    private List<User> users;
    private int numUsers;

    public UserManager(List<User> users){
        this.users = users;
        this.numUsers = users.size();
    }

    public int getNumUsers() {
        return numUsers;
    }

    public User createUser(int id, String username){
        User newUser = new User(id, username);
        return newUser;
    }

    public void addUser(User u) throws CapacityException {
        if(numUsers < 6){
            users.add(u);
        }
        else{
            throw new CapacityException();
        }
    }
}
