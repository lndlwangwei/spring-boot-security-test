package cn.iwangwei.springbootsecuritytest.service;

import cn.iwangwei.springbootsecuritytest.dao.UserRepository;
import cn.iwangwei.springbootsecuritytest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getByName(String username) {
        return userRepository.getByUsername(username);
    }
}
