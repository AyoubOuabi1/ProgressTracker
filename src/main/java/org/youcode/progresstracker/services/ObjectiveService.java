package org.youcode.progresstracker.services;

import org.youcode.progresstracker.entities.Objective;
import org.youcode.progresstracker.repositories.ObjectiveRepository;

import java.util.List;
import java.util.Optional;

public class ObjectiveService {

    ObjectiveRepository objectiveRepository;

    public ObjectiveService (ObjectiveRepository objectiveRepository){
        this.objectiveRepository = objectiveRepository;
    }

    public void saveObjective(Objective objective){
        objectiveRepository.save(objective);
    }

    public void deleteObjective(Objective objective){
        objectiveRepository.delete(objective);
    }

    public List<Objective> getAllObjectives(){
        return objectiveRepository.findAll();
    }

    public Optional<Objective> getObjective(Long id){
        return objectiveRepository.findById(id);
    }
}
