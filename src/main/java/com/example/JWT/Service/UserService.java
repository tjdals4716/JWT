package com.example.JWT.Service;

import com.example.JWT.DTO.JWTDTO;
import com.example.JWT.DTO.UserDTO;

import java.util.Date;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserByUid(String uid);
    JWTDTO login(String uid, String password);
    boolean isUidDuplicate(String uid);
    boolean isNicknameDuplicate(String nickname);
    UserDTO updateUser(String uid, String token, UserDTO userDTO);
    void deleteUser(String uid, String token);
    String extendToken(String uid);
    Long getTokenRemainingTime(String token);
}
