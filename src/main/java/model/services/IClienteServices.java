package model.services;

import model.Entity.Cliente;

import java.util.List;

public interface IClienteServices {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);
}
