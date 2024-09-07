package com.travel.travel_backend_java.Controller;

import com.travel.travel_backend_java.Exception.NotFoundException;
import com.travel.travel_backend_java.Model.User;
import com.travel.travel_backend_java.Repository.UserRepository;
import com.travel.travel_backend_java.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable String id){
        return userService.getById(id);
    }

    //tìm nhìu user theo username gần đúng
    @GetMapping("/username/{username}")
    public List<User> getByUserName(@PathVariable String username){
        return userService.getUsernameContainingIgnoreCase(username);
    }

    //tạo user
    @PostMapping
    public User save(@RequestBody User user){
        //truyền vào id rỗng
        return userService.save("", user);
    }

    //cập nhật user
    @PutMapping("/{id}")
    public User update(@PathVariable String id, @RequestBody User user){

        return userService.save(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        userService.delete(id);
    }
}
