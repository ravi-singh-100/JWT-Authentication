package com.example.jwt.JWT.example.Service;

import com.example.jwt.JWT.example.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class HomeService {
 List<User>store=new ArrayList<>();
 HomeService(){
     store.add(User.builder().userId(UUID.randomUUID().toString()).name("ravi").email("ravi@gmail.com").build());
     store.add(User.builder().userId(UUID.randomUUID().toString()).name("simran").email("simran@gmail.com").build());
     store.add(User.builder().userId(UUID.randomUUID().toString()).name("anmol").email("anmol@gmail.com").build());
     store.add(User.builder().userId(UUID.randomUUID().toString()).name("magan").email("magan@gmail.com").build());
 }
 public List<User> getUsers(){
     return this.store;
 }
}
