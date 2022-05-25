// Generated with g9.

package com.dwa.asej.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="usuario")
public class Usuario implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=50)
    private String curp;
    @Column(nullable=false, length=50)
    private String rango;
    @Column(nullable=false, length=50)
    private String claveacceso;
    @OneToMany(mappedBy="usuario")
    private Set<Alumno> alumno;
    @OneToMany(mappedBy="usuario")
    private Set<Profesor> profesor;

    /** Default constructor. */
    public Usuario() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for curp.
     *
     * @return the current value of curp
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Setter method for curp.
     *
     * @param aCurp the new value for curp
     */
    public void setCurp(String aCurp) {
        curp = aCurp;
    }

    /**
     * Access method for rango.
     *
     * @return the current value of rango
     */
    public String getRango() {
        return rango;
    }

    /**
     * Setter method for rango.
     *
     * @param aRango the new value for rango
     */
    public void setRango(String aRango) {
        rango = aRango;
    }

    /**
     * Access method for claveacceso.
     *
     * @return the current value of claveacceso
     */
    public String getClaveacceso() {
        return claveacceso;
    }

    /**
     * Setter method for claveacceso.
     *
     * @param aClaveacceso the new value for claveacceso
     */
    public void setClaveacceso(String aClaveacceso) {
        claveacceso = aClaveacceso;
    }

    /**
     * Access method for alumno.
     *
     * @return the current value of alumno
     */
    public Set<Alumno> getAlumno() {
        return alumno;
    }

    /**
     * Setter method for alumno.
     *
     * @param aAlumno the new value for alumno
     */
    public void setAlumno(Set<Alumno> aAlumno) {
        alumno = aAlumno;
    }

    /**
     * Access method for profesor.
     *
     * @return the current value of profesor
     */
    public Set<Profesor> getProfesor() {
        return profesor;
    }

    /**
     * Setter method for profesor.
     *
     * @param aProfesor the new value for profesor
     */
    public void setProfesor(Set<Profesor> aProfesor) {
        profesor = aProfesor;
    }

    /**
     * Compares the key for this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Usuario and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Usuario)) {
            return false;
        }
        Usuario that = (Usuario) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Usuario)) return false;
        return this.equalKeys(other) && ((Usuario)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Usuario |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
