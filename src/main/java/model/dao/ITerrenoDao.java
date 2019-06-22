package model.dao;

import model.Entity.Terreno;
import org.springframework.data.repository.CrudRepository;

public interface ITerrenoDao extends CrudRepository<Terreno, Long> {
}
