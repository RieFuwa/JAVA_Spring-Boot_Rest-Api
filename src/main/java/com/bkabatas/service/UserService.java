package com.bkabatas.service;

import com.bkabatas.entity.Users;

import java.util.List;

public interface UserService {

    Users createUser(Users users); //default olarak public ve abstracttır yazmaya gerek yok.
    List<Users> getUsers();
    Users getUser(Long id);
    Users updateUser(Long id, Users users );
    Boolean deleteUser(Long id);


}
