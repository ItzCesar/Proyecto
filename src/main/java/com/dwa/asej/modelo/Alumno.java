// Generated with g9.

package com.dwa.asej.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="alumno")
public class Alumno implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=50)
    private String nombre;
    @Column(nullable=false, length=50)
    private String apellidop;
    @Column(nullable=false, length=50)
    private String apellidom;
    @Column(nullable=false, length=30)
    private String ncontrol;
    @Column(nullable=false, length=10)
    private String semestre;
    @Column(nullable=false, length=30)
    private String carrera;
    @ManyToOne(optional=false)
    @JoinColumn(name="idusua", nullable=false)
    private Usuario usuario;

    /** Default constructor. */
    public Alumno() {
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
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for apellidop.
     *
     * @return the current value of apellidop
     */
    public String getApellidop() {
        return apellidop;
    }

    /**
     * Setter method for apellidop.
     *
     * @param aApellidop the new value for apellidop
     */
    public void setApellidop(String aApellidop) {
        apellidop = aApellidop;
    }

    /**
     * Access method for apellidom.
     *
     * @return the current value of apellidom
     */
    public String getApellidom() {
        return apellidom;
    }

    /**
     * Setter method for apellidom.
     *
     * @param aApellidom the new value for apellidom
     */
    public void setApellidom(String aApellidom) {
        apellidom = aApellidom;
    }

    /**
     * Access method for ncontrol.
     *
     * @return the current value of ncontrol
     */
    public String getNcontrol() {
        return ncontrol;
    }

    /**
     * Setter method for ncontrol.
     *
     * @param aNcontrol the new value for ncontrol
     */
    public void setNcontrol(String aNcontrol) {
        ncontrol = aNcontrol;
    }

    /**
     * Access method for semestre.
     *
     * @return the current value of semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(String aSemestre) {
        semestre = aSemestre;
    }

    /**
     * Access method for carrera.
     *
     * @return the current value of carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Setter method for carrera.
     *
     * @param aCarrera the new value for carrera
     */
    public void setCarrera(String aCarrera) {
        carrera = aCarrera;
    }

    /**
     * Access method for usuario.
     *
     * @return the current value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Setter method for usuario.
     *
     * @param aUsuario the new value for usuario
     */
    public void setUsuario(Usuario aUsuario) {
        usuario = aUsuario;
    }

    /**
     * Compares the key for this instance with another Alumno.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Alumno and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Alumno)) {
            return false;
        }
        Alumno that = (Alumno) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Alumno.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Alumno)) return false;
        return this.equalKeys(other) && ((Alumno)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Alumno |");
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
