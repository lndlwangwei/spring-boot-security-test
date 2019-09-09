package cn.iwangwei.springbootsecuritytest.dao;

import cn.iwangwei.springbootsecuritytest.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User getByUsername(String username);
}
