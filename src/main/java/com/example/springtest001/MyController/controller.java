package com.example.springtest001.MyController;

import com.example.springtest001.User.user;
import com.example.springtest001.stringService.serviceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class controller {

    @Autowired
    private serviceImplement serviceimplement;

    @GetMapping("/name")
    public String Hello(String name){
        return "HELLO SPRING";
    }

    @GetMapping("/stu")
    public List<user> findAll(){

        return this.serviceimplement.getUsers();
//        List<user> u=serviceimplement.getUsers();
//        if(u.size() <= 0){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        return ResponseEntity.status(HttpStatus.CREATED).body(u);
    }

    @PostMapping("/stu")
    public user post(@RequestBody user User){
//        user u=null;
//        try {
//            u = serviceimplement.addUser(User);
//            return ResponseEntity.of(Optional.of(u));
//        }catch (Exception e){
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//
        return this.serviceimplement.addUser(User);
    }
}
