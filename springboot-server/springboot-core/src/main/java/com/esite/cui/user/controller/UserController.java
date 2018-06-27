package com.esite.cui.user.controller;

import com.esite.cui.user.entity.User;
import com.esite.cui.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/saveUser")
    public ResponseEntity<String> saveUser(User user){
        String id=userService.saveUser(user);
        if(id!=""&&id!=null){
            return new ResponseEntity<String>(id, HttpStatus.OK);
        }
        return new ResponseEntity<String>(id, HttpStatus.BAD_REQUEST);

    }
}
