package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Yeltzyn_Sierra")
public class YeltzynSierra {
    @Id
    @Column(name = "#Pregunta")
    private String pregunta;
    @Column(name = "Letra Resp")
    private String letra;
    @Column(name = "Argumento")
    private String argumento;

    public YeltzynSierra() {
    }

    public YeltzynSierra(String pregunta, String letra, String argumento) {
        this.pregunta = pregunta;
        this.letra = letra;
        this.argumento = argumento;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((letra == null) ? 0 : letra.hashCode());
        result = prime * result + ((argumento == null) ? 0 : argumento.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        YeltzynSierra other = (YeltzynSierra) obj;
        if (pregunta != other.pregunta)
            return false;
        if (letra == null) {
            if (other.letra != null)
                return false;
        } else if (!letra.equals(other.letra))
            return false;
        if (argumento == null) {
            if (other.argumento != null)
                return false;
        } else if (!argumento.equals(other.argumento))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "YeltzynSierra [pregunta=" + pregunta + ", respuesta=" + letra + ", argumento=" + argumento + "]";
    }
}