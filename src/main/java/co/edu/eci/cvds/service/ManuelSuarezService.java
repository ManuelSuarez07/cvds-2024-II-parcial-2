package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.ManuelSuarez;
import co.edu.eci.cvds.repository.ManuelSuarezRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManuelSuarezService {

    private final ManuelSuarezRepository manuelSuarezRepository;

    @Autowired
    public ManuelSuarezService(ManuelSuarezRepository manuelSuarezRepository) {
        this.manuelSuarezRepository = manuelSuarezRepository;
    }

    public ManuelSuarez addPregunta(ManuelSuarez pregunta) {
        return manuelSuarezRepository.save(pregunta);
    }

    public ManuelSuarez getPregunta(int pregunta) {
        return manuelSuarezRepository.findByPregunta(pregunta);
    }

    public List<ManuelSuarez> getAllPreguntas() {
        return manuelSuarezRepository.findAll();
    }

    public ManuelSuarez editPregunta(ManuelSuarez pregunta) {
        return manuelSuarezRepository.save(pregunta);
    }

    public void deletePregunta(int pregunta) {
        manuelSuarezRepository.deleteByPregunta(pregunta);
    }
}
