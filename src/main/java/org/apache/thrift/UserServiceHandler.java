package org.apache.thrift;

import org.apache.thrift.generated.User;
import org.apache.thrift.generated.UserNotFound;
import org.apache.thrift.generated.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceHandler implements UserService.Iface {

    @Override
    public List<User> getUsers() throws TException {
        return users();
    }

    @Override
    public User getUserByName(String username) throws UserNotFound, TException {
        for (User user : users()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        throw new UserNotFound();
    }

    private List<User> users() {
        List<User> users = new ArrayList<User>();
        users.add(createUser(1, "user1", "password1"));
        users.add(createUser(2, "user2", "password2"));
        return users;
    }

    private User createUser(int id, String username, String password) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }
}