package model.services;

import model.Entity.Occiso;

import java.util.List;

public interface IOccisoServices {

    public List<Occiso> findAll();

    public Occiso findById(Long id);

    public Occiso save(Occiso occiso);

    public void delete(Long id);
}
