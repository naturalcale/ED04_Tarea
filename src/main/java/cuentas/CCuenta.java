package cuentas;

/**
 * Clase que gestiona los datos de una cuenta bancaria
 * @author Juan Manuel Ruiz Bolívar
 * @version 1.0
 */

public class CCuenta {

    /**
     * @return Devuelve el valor del atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Cambia el valor de este atributo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *  @return Devuelve el valor del atributo cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta Cambia el valor de este atributo
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *  @return Devuelve el valor del atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo Cambia el valor de este atributo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *  @return Devuelve el valor del atributo tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés Cambia el valor de este atributo
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * DECLARACIÓN DE ATRIBUTOS
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * CONSTRUCTOR
     */
    public CCuenta()
    {
    }

    /**
     * CONSTRUCTOR CON PARÁMETROS
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * MÉTODO QUE DEVUELVE EL VALOR CONTENIDO EN getsaldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que genera una excepción para valores negativos de la variable cantidad
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que genera excepciones para valores incorrectos de la variable cantidad
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}