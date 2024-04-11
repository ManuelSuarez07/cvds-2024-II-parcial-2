package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.JulianTriana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JulianTrianaRepository extends JpaRepository<JulianTriana, String> {
    public List<JulianTriana> findByPropiedad(String pregunta
    );

}