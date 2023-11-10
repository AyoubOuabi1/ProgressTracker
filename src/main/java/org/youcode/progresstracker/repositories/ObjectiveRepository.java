package org.youcode.progresstracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.youcode.progresstracker.entities.Objective;

public interface ObjectiveRepository extends JpaRepository<Objective,Long> {
}
