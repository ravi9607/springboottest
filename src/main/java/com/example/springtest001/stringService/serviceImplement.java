package com.example.springtest001.stringService;

import com.example.springtest001.User.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImplement  {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private UserRepository userRepository;

    public List<user> getUsers() {
        return userRepository.findAll();
    }


    public user addUser(user User)  {
//        if(User==null){
//            return try {
//                throw new Exception("Null object");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

        userRepository.save(User);
        return User;
    }

    public user getUserById(long id){
        user u = null;
        try {
            u= userRepository.findById(id).get();   // "getOne(id)" NOT WORK  use  "findById(id).get()"
        }catch (Exception e){
            e.printStackTrace();
        }
        return u; 
    }

    public user updateUser(user User){
        return userRepository.save(User);
    }

    public void deleteById(long parseLong) {
        user u = userRepository.findById(parseLong).get();
        userRepository.delete(u);
    }

//    public user getUserByName(String fName){
//        return  userRepository.findByFName(fName);
//    }

//    public List<user> findByIdAndFName(Long Id,String FName){
//        return userRepository.findAllByIdAndFName(Id,FName);
//    }


}
