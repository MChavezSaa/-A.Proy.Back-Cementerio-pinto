package model.services;

import model.Entity.Occiso;
import model.dao.IOccisoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OccisoServicesImpl implements  IOccisoServices{

    @Autowired
    private IOccisoDao occisoDao;
    @Transactional(readOnly=true)
    public List<Occiso> findAll() {
        // TODO Auto-generated method stub
        return (List<Occiso>) occisoDao.findAll();
    }
    @Transactional(readOnly=true)
    public Occiso findById(Long id) {
        // TODO Auto-generated method stub
        return occisoDao.findById(id).orElse(null);
    }
    @Transactional
    public Occiso save(Occiso occiso) {
        // TODO Auto-generated method stub
        return occisoDao.save(occiso);
    }
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub
        occisoDao.deleteById(id);
    }

}
