package org.youcode.progresstracker.repositories;
import org.youcode.progresstracker.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

 }
