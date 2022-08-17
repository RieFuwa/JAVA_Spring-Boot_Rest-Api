package com.bkabatas.api;

import com.bkabatas.entity.Users;
import com.bkabatas.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<Users> createUser(@RequestBody Users users){
            Users resultUser = userService.createUser(users);
          return ResponseEntity.ok(resultUser);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Users>> getUsers(){
        List<Users> users = userService.getUsers();
        return  ResponseEntity.ok(users);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Users> getUser(@PathVariable("id") Long id){
        Users users = userService.getUser(id);
        return ResponseEntity.ok(users);
    }

    @PutMapping("/update/{id}")
    public  ResponseEntity<Users> updateUser(@PathVariable("id") Long id, @RequestBody Users users){
        Users resultUser =userService.updateUser(id, users);
        return ResponseEntity.ok(resultUser);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id")Long id){
       Boolean status = userService.deleteUser(id);
       return ResponseEntity.ok(status);
    }



}



