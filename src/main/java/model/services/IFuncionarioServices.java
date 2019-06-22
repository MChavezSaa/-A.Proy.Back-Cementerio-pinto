package model.services;

import model.Entity.funcionario;

import java.util.List;

public interface IFuncionarioServices {
    public List<funcionario> findAll();

    public funcionario findById(Long id);

    public funcionario save(funcionario cliente);

    public void delete(Long id);
}
