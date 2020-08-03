package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDataAccess implements UserRepository {

    List<User> userList = new ArrayList<>();

    @Override
    public int addUser(User user) {
        userList.add(user);
        return 1;
    }

    @Override
    public List<User> viewUsers() {
        return userList;
    }

    @Override
    public void editUser(String userLogin) {

    }

    @Override
    public void deleteUser(String userLogin) {

    }

    @Override
    public void changeRole(String userLogin) {

    }

    @Override
    public void enableUser(String userLogin) {

    }
}
