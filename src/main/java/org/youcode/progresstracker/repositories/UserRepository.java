package org.youcode.progresstracker.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.youcode.progresstracker.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {

 }
