package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.ManuelSuarez;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManuelSuarezRepository extends JpaRepository<ManuelSuarez, Integer> {
    public ManuelSuarez findByPregunta(int pregunta);
    public void deleteByPregunta(int pregunta);
}
