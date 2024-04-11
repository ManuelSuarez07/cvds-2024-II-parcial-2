package co.edu.eci.cvds.service;
 
import co.edu.eci.cvds.model.YeltzynSierra;
import co.edu.eci.cvds.repository.YeltzynSierraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class YeltzynSierraService {
 
    private final YeltzynSierraRepository yeltzynSierraRepository;
 
    @Autowired
    public YeltzynSierraService(YeltzynSierraRepository yeltzynSierraRepository) {
        this.yeltzynSierraRepository = yeltzynSierraRepository;
    }
 
    public YeltzynSierra addPregunta(YeltzynSierra pregunta) {
        return yeltzynSierraRepository.save(pregunta);
    }
 
    public List<YeltzynSierra> getPregunta(int pregunta) {
        return yeltzynSierraRepository.findByPregunta(pregunta);
    }
 
    public List<YeltzynSierra> getAllPreguntas() {
        return yeltzynSierraRepository.findAll();
    }
 
    public YeltzynSierra editPregunta(YeltzynSierra pregunta) {
        return yeltzynSierraRepository.save(pregunta);
    }
 
    public void deletePregunta(int pregunta) {
        yeltzynSierraRepository.deleteByPregunta(pregunta);
    }
}