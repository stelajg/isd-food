package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.Role;
import com.isdfood.isdproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository {
    int addUser(User user);
    List<User> viewUsers();
    void editUser(String userLogin);
    void deleteUser(String userLogin);
    void changeRole(String userLogin);
    void enableUser(String userLogin);
    default int addUser(String login, String password, String email, String firstName, String lastName, String employmentDate, Role role, String skypeId){
        return addUser(new User(login, password, email, firstName, lastName, employmentDate, role, skypeId));
    }
}
