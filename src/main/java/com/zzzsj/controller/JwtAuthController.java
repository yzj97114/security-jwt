package com.zzzsj.controller;

import com.zzzsj.entity.User;
import com.zzzsj.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.security.sasl.AuthenticationException;

/**
 * @author 79282
 */
@RestController
public class JwtAuthController {

    @Autowired
    private AuthService authService;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     * @throws AuthenticationException
     */
    @RequestMapping(value = "/authentication/login", method = RequestMethod.POST)
    public String createToken( String username,String password ) throws AuthenticationException {
        return authService.login( username, password );
    }

    /**
     * 注册
     * @param addedUser
     * @return
     * @throws AuthenticationException
     */
    @RequestMapping(value = "/authentication/register", method = RequestMethod.POST)
    public User register( @RequestBody User addedUser ) throws AuthenticationException {
        return authService.register(addedUser);
    }

}