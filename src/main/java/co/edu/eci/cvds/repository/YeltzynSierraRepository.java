package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.YeltzynSierra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YeltzynSierraRepository extends JpaRepository<YeltzynSierra, String> {
    public List<YeltzynSierra> findByPregunta(int pregunta);
    public List<YeltzynSierra> deleteByPregunta(int pregunta);

}