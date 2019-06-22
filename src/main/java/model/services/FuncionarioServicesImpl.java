package model.services;

import model.Entity.Cliente;
import model.Entity.funcionario;
import model.dao.IFuncionarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FuncionarioServicesImpl implements IFuncionarioServices {

    @Autowired
    private IFuncionarioDao funcionarioDao;
    @Transactional(readOnly=true)
    public List<funcionario> findAll() {
        // TODO Auto-generated method stub
        return (List<funcionario>) funcionarioDao.findAll();
    }
    @Transactional(readOnly=true)
    public funcionario findById(Long id) {
        // TODO Auto-generated method stub
        return funcionarioDao.findById(id).orElse(null);
    }
    @Transactional
    public funcionario save(funcionario funcionario) {
        // TODO Auto-generated method stub
        return funcionarioDao.save(funcionario);
    }
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub
        funcionarioDao.deleteById(id);
    }

}
