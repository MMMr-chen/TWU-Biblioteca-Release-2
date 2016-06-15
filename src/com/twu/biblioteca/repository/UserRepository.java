package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String,User> userMap = new HashMap<String, User>();
    public UserRepository(){
        userMap.put("111-1111",new User("111-1111","user1","111","111@111.com","12312123"));
        userMap.put("222-2222",new User("222-2222","user2","222","222@222.com","12312123"));
        userMap.put("333-3333",new User("333-3333","user3","333","333@333.com","12312123"));
    }
    public Map<String ,User> getUserMap(){
        return  userMap;
    }
}
