package org.youcode.progresstracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.youcode.progresstracker.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
