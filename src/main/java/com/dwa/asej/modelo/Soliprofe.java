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

@Entity(name="soliprofe")
public class Soliprofe implements Serializable {

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
    private String ntrabajador;
    @Column(nullable=false, length=50)
    private String cargo;
    @Column(nullable=false, length=30)
    private String ncontrol;
    @Column(nullable=false, length=40)
    private String materia;
    @Column(nullable=false, length=50)
    private String fecha;
    @Column(nullable=false, length=100)
    private String motivo;

    /** Default constructor. */
    public Soliprofe() {
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
     * Access method for cargo.
     *
     * @return the current value of cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Setter method for cargo.
     *
     * @param aCargo the new value for cargo
     */
    public void setCargo(String aCargo) {
        cargo = aCargo;
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
     * Access method for fecha.
     *
     * @return the current value of fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Setter method for fecha.
     *
     * @param aFecha the new value for fecha
     */
    public void setFecha(String aFecha) {
        fecha = aFecha;
    }

    /**
     * Access method for motivo.
     *
     * @return the current value of motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Setter method for motivo.
     *
     * @param aMotivo the new value for motivo
     */
    public void setMotivo(String aMotivo) {
        motivo = aMotivo;
    }

    /**
     * Compares the key for this instance with another Soliprofe.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Soliprofe and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Soliprofe)) {
            return false;
        }
        Soliprofe that = (Soliprofe) other;
        if (this.getFolio() != that.getFolio()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Soliprofe.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Soliprofe)) return false;
        return this.equalKeys(other) && ((Soliprofe)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Soliprofe |");
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
