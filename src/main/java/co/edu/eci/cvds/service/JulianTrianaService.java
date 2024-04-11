package co.edu.eci.cvds.service;
 
import co.edu.eci.cvds.model.JulianTriana;
import co.edu.eci.cvds.repository.JulianTrianaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class JulianTrianaService {
 
    private final JulianTrianaRepository JulianTrianaRepository;
 
    @Autowired
    public JulianTrianaService(JulianTrianaRepository JulianTrianaRepository) {
        this.JulianTrianaRepository = JulianTrianaRepository;
    }
 
    public JulianTriana addPregunta(JulianTriana pregunta) {
        return JulianTrianaRepository.save(pregunta);
    }
 
    public JulianTriana getPregunta(int pregunta) {
        return JulianTrianaRepository.findByPregunta(pregunta);
    }
 
    public List<JulianTriana> getAllPreguntas() {
        return JulianTrianaRepository.findAll();
    }
 
    public JulianTriana editPregunta(JulianTriana pregunta) {
        return JulianTrianaRepository.save(pregunta);
    }
 
    public void deletePregunta(int pregunta) {
        JulianTrianaRepository.deleteByPregunta(pregunta);
    }
}
