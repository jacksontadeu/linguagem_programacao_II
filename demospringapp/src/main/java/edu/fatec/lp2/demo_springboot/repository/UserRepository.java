package edu.fatec.lp2.demo_springboot.repository;

import edu.fatec.lp2.demo_springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
