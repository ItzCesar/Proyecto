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

@Entity(name="profesor")
public class Profesor implements Serializable {

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
    private String apeliddom;
    @Column(nullable=false, length=50)
    private String ntrabajador;
    @ManyToOne(optional=false)
    @JoinColumn(name="idusup", nullable=false)
    private Usuario usuario;

    /** Default constructor. */
    public Profesor() {
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
     * Access method for apeliddom.
     *
     * @return the current value of apeliddom
     */
    public String getApeliddom() {
        return apeliddom;
    }

    /**
     * Setter method for apeliddom.
     *
     * @param aApeliddom the new value for apeliddom
     */
    public void setApeliddom(String aApeliddom) {
        apeliddom = aApeliddom;
    }

    /**
     * Access method for ntrabajador.
     *
     * @return the current value of ntrabajador
     */
    public String getNtrabajador() {
        return ntrabajador;
    }

    /**
     * Setter method for ntrabajador.
     *
     * @param aNtrabajador the new value for ntrabajador
     */
    public void setNtrabajador(String aNtrabajador) {
        ntrabajador = aNtrabajador;
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
     * Compares the key for this instance with another Profesor.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Profesor and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Profesor)) {
            return false;
        }
        Profesor that = (Profesor) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Profesor.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Profesor)) return false;
        return this.equalKeys(other) && ((Profesor)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Profesor |");
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
