package com.example.jwt.JWT.example.Controller;

import com.example.jwt.JWT.example.Model.User;
import com.example.jwt.JWT.example.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
@Autowired
    HomeService homeService;
    @GetMapping("/users")
    public List<User> getUsers(){
      System.out.println("Getting Users");
     return homeService.getUsers();
    }
    @GetMapping("/current-user")
    public String currentUser(Principal principal){
        return principal.getName();
    }
}
