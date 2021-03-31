package ua.shestakov.spring.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.shestakov.spring.boot.demo.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
