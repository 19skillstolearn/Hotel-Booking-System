package com.skillstolearn.hotelsearch.Service;

import com.skillstolearn.hotelsearch.Persistence.model.User;
import com.skillstolearn.hotelsearch.Web.dto.UserDto;

public interface UserService {
    User findUserByEmail(String email);

    void createUserAccount(UserDto user);
}
