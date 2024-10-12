package org.bankapp.service;

import org.apache.catalina.User;
import org.bankapp.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private UserDTO userDTO;
    
    public UserDTO register() {
        return userDTO;
    }
    
    public  UserDTO login() {
        return userDTO;
    }
    
    public UserDTO updateProfile() {
        return userDTO;
    }
}
