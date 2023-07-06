package com.finalproject.kits.mmovies.Controller;

import com.finalproject.kits.mmovies.Entity.Users;
import com.finalproject.kits.mmovies.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@Controller
@RequestMapping(path = "/users")
public class UsersController {


    @Autowired
    private UsersRepository usersRepository;
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Users> getAllUsers() {
        return usersRepository.findAll();
    }
    @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Users> postBody (@RequestBody Users user)
    {
        Users users = usersRepository.save(user);
        return ResponseEntity.created(URI.create("")).body(users);
    }
//    @PutMapping("/{ser_id}")
//    public Users (@RequestBody Users user,@PathVariable Integer user_id) {
//        return usersRepository.findById(user_id).m
//    }
}
