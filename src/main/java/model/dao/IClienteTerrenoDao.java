package model.dao;

import model.Entity.ClienteTerreno;
import org.springframework.data.repository.CrudRepository;

public interface IClienteTerrenoDao extends CrudRepository<ClienteTerreno, Long> {
}
