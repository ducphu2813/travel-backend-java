package com.travel.travel_backend_java.Service;

import com.travel.travel_backend_java.Exception.NotFoundException;
import com.travel.travel_backend_java.Model.User;
import com.travel.travel_backend_java.Repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getById(String id){
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User with ID " + id + " not found"));
    }

    public User getByUserName(String userName){
        return userRepository.findByUsername(userName)
                .orElseThrow(() -> new NotFoundException("User with username " + userName + " not found"));
    }

    public List<User> getUsernameContainingIgnoreCase(String userName){
        return userRepository.findByUsernameContainingIgnoreCase(userName);
    }

    @Transactional
    public User save(String id, User user){

        //nếu id truyền vào mà không rỗng thì cập nhật user cũ
        if(id != null && !id.isEmpty()){
            User oldUser = userRepository.findById(id)
                    .orElseThrow(() -> new NotFoundException("User with ID " + id + " not found"));
            oldUser.setId(id);
            oldUser.setName(user.getName());
            oldUser.setUsername(user.getUsername());
            oldUser.setEmail(user.getEmail());
            oldUser.setPassword(user.getPassword());
            return userRepository.save(oldUser);
        }

        //nếu id rỗng thì tạo mới user
        return userRepository.save(user);
    }

    @Transactional
    public void delete(String id){
        userRepository.deleteById(id);
    }
}
