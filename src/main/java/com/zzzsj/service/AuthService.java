package com.zzzsj.service;

import com.zzzsj.entity.User;

public interface AuthService {
    User register( User userToAdd );
    String login( String username, String password );
}
