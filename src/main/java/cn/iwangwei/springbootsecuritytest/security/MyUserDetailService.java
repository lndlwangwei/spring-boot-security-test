package cn.iwangwei.springbootsecuritytest.security;

import cn.iwangwei.springbootsecuritytest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        cn.iwangwei.springbootsecuritytest.domain.User user = userService.getByName(username);
        return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }
}
