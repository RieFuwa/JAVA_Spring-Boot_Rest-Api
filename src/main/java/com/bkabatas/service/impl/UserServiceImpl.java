package com.bkabatas.service.impl;

import com.bkabatas.entity.Users;
import com.bkabatas.repository.UserRepository;
import com.bkabatas.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public Users createUser(Users users) {
        users.setCreatedDate(new Date());
        users.setCreatedBy("Admin");

        return userRepository.save(users);
    }

    @Override
    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users getUser(Long id) {
        Optional<Users>users= userRepository.findById(id);
        if(users.isPresent()){
            return users.get();
        }
        return null;
    }

    @Override
    public Users updateUser(Long id, Users users) {
        Optional<Users> resultUsers = userRepository.findById(id);
        if(resultUsers.isPresent()){
            resultUsers.get().setFirstName(users.getFirstName());
            resultUsers.get().setLastName(users.getLastName());
            resultUsers.get().setUpdatedAt(new Date());
            resultUsers.get().setUpdatedBy("Admin");
            return userRepository.save(resultUsers.get());
        }
        return null;
    }

    @Override
    public Boolean deleteUser(Long id) {
        Optional<Users> deleteUsers= userRepository.findById(id);
        if (deleteUsers.isPresent()){
           userRepository.deleteById(id);
           return true;
        }
            return false;
        }


}