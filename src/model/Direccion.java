package model;

/**
 * Clase que representa la dirección de una persona.
 */
public class Direccion {

    private String calle;
    private String ciudad;
    private String region;

    /**
     * Constructor de la clase Direccion.
     *
     * @param calle nombre de la calle
     * @param ciudad ciudad
     * @param region región
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     * @return la calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle nueva calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad nueva ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return la región
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region nueva región
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Representación en texto de la dirección
     */
    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}