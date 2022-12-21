package com.miu.registration.service.DTO;

import com.miu.registration.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserAdapter {

    public User getUserFromUserDTO(UserDTO userDTO){
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        return user;
    }
    public UserDTO getUserDTOFromUser(User user){
        UserDTO userDTO = new UserDTO();
        user.setUsername(userDTO.getUsername());
        return userDTO;
    }
}
