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

@Entity(name="soliadmin")
public class Soliadmin implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "folio";


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int folio;
    @Column(nullable=false, length=50)
    private String nombrep;
    @Column(nullable=false, length=50)
    private String apeliidop;
    @Column(nullable=false, length=60)
    private String correo;
    @Column(nullable=false, length=40)
    private String materia;
    @Column(nullable=false, length=50)
    private String fechasoli;
    @Column(nullable=false, length=50)
    private String fechaini;
    @Column(nullable=false, length=50)
    private String fechafin;

    /** Default constructor. */
    public Soliadmin() {
        super();
    }

    /**
     * Access method for folio.
     *
     * @return the current value of folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Setter method for folio.
     *
     * @param aFolio the new value for folio
     */
    public void setFolio(int aFolio) {
        folio = aFolio;
    }

    /**
     * Access method for nombrep.
     *
     * @return the current value of nombrep
     */
    public String getNombrep() {
        return nombrep;
    }

    /**
     * Setter method for nombrep.
     *
     * @param aNombrep the new value for nombrep
     */
    public void setNombrep(String aNombrep) {
        nombrep = aNombrep;
    }

    /**
     * Access method for apeliidop.
     *
     * @return the current value of apeliidop
     */
    public String getApeliidop() {
        return apeliidop;
    }

    /**
     * Setter method for apeliidop.
     *
     * @param aApeliidop the new value for apeliidop
     */
    public void setApeliidop(String aApeliidop) {
        apeliidop = aApeliidop;
    }

    /**
     * Access method for correo.
     *
     * @return the current value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Setter method for correo.
     *
     * @param aCorreo the new value for correo
     */
    public void setCorreo(String aCorreo) {
        correo = aCorreo;
    }

    /**
     * Access method for materia.
     *
     * @return the current value of materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Setter method for materia.
     *
     * @param aMateria the new value for materia
     */
    public void setMateria(String aMateria) {
        materia = aMateria;
    }

    /**
     * Access method for fechasoli.
     *
     * @return the current value of fechasoli
     */
    public String getFechasoli() {
        return fechasoli;
    }

    /**
     * Setter method for fechasoli.
     *
     * @param aFechasoli the new value for fechasoli
     */
    public void setFechasoli(String aFechasoli) {
        fechasoli = aFechasoli;
    }

    /**
     * Access method for fechaini.
     *
     * @return the current value of fechaini
     */
    public String getFechaini() {
        return fechaini;
    }

    /**
     * Setter method for fechaini.
     *
     * @param aFechaini the new value for fechaini
     */
    public void setFechaini(String aFechaini) {
        fechaini = aFechaini;
    }

    /**
     * Access method for fechafin.
     *
     * @return the current value of fechafin
     */
    public String getFechafin() {
        return fechafin;
    }

    /**
     * Setter method for fechafin.
     *
     * @param aFechafin the new value for fechafin
     */
    public void setFechafin(String aFechafin) {
        fechafin = aFechafin;
    }

    /**
     * Compares the key for this instance with another Soliadmin.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Soliadmin and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Soliadmin)) {
            return false;
        }
        Soliadmin that = (Soliadmin) other;
        if (this.getFolio() != that.getFolio()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Soliadmin.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Soliadmin)) return false;
        return this.equalKeys(other) && ((Soliadmin)other).equalKeys(this);
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
        i = getFolio();
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
        StringBuffer sb = new StringBuffer("[Soliadmin |");
        sb.append(" folio=").append(getFolio());
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
        ret.put("folio", Integer.valueOf(getFolio()));
        return ret;
    }

}
