package model.dao;

import model.Entity.Occiso;
import org.springframework.data.repository.CrudRepository;

public interface IOccisoDao extends CrudRepository<Occiso,Long> {
}
