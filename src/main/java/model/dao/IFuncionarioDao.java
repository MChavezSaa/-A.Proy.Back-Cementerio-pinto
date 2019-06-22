package model.dao;

import model.Entity.funcionario;
import org.springframework.data.repository.CrudRepository;

public interface IFuncionarioDao extends CrudRepository<funcionario, Long> {
}
