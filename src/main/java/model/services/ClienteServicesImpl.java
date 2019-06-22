package model.services;

import model.Entity.Cliente;
import model.dao.IClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServicesImpl implements  IClienteServices{

    @Autowired
    private IClienteDao clienteDao;
    @Transactional(readOnly=true)
    public List<Cliente> findAll() {
        // TODO Auto-generated method stub
        return (List<Cliente>) clienteDao.findAll();
    }
    @Transactional(readOnly=true)
    public Cliente findById(Long id) {
        // TODO Auto-generated method stub
        return clienteDao.findById(id).orElse(null);
    }
    @Transactional
    public Cliente save(Cliente cliente) {
        // TODO Auto-generated method stub
        return clienteDao.save(cliente);
    }
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub
        clienteDao.deleteById(id);
    }

}
