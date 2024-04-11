package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ManuelSuarez")
public class ManuelSuarez {
    @Id
    @Column(name = "#Pregunta")
    private int pregunta;
    @Column(name = "Respuesta")
    private String respuesta;
    @Column(name = "Argumento")
    private String argumento;

    public ManuelSuarez() {
    }

    public ManuelSuarez(int preg, String resp, String arg) {
        this.pregunta = preg;
        this.respuesta = resp;
        this.argumento = arg;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + pregunta;
        result = prime * result + ((respuesta == null) ? 0 : respuesta.hashCode());
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
        ManuelSuarez other = (ManuelSuarez) obj;
        if (pregunta != other.pregunta)
            return false;
        if (respuesta == null) {
            if (other.respuesta != null)
                return false;
        } else if (!respuesta.equals(other.respuesta))
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
        return "ManuelSuarez [pregunta=" + pregunta + ", respuesta=" + respuesta + ", argumento=" + argumento + "]";
    }
       
}