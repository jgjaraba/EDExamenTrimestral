
/**
 * Genera un objeto cafetera, permitiendo operar con él y modificar sus características.
 *
 * @author JoseGJ
 * @version 1.0
 * @since 2021
 */
public class Cafetera implements InterfazCafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = Math.max(capacidadMaxima, cantidadActual);
    }

    /**
     * Constructor de la clase Cafetera. Genera un objeto con el parámetro
     * indicado.
     *
     * @param capacidadMaxima
     */
    public Cafetera(int capacidadMaxima) {
        this(capacidadMaxima, 0);
    }

    /**
     * Contructor de la clase cafetera. Genera un objeto con parámetros por
     * defecto.
     */
    public Cafetera() {
        this(1000, 0);
    }

    /**
     * LLena la cafetera sustituyendo el valor de la propiedad cantidadActual
     * con el de cantidadMaxima.
     */
    @Override
    public void llenarCafetera() {
        setCantidadActual(getCapacidadMaxima());
    }

    /**
     * Sirve una taza de café del tamaño especificado si la cafetera tiene café
     * suficiente. De lo contrario tira una excepción avisando de que no hay
     * café.
     *
     * @param tamanoTaza especifica el tamaño de la taza a servir.
     * @throws Exception
     */
    @Override
    public void servirTaza(int tamanoTaza) throws Exception {
        setCantidadActual(getCantidadActual() - tamanoTaza);
        if (getCantidadActual() < 0) {
            setCantidadActual(0);
            throw new Exception("No hay café");
        }
    }

    /**
     * Vacía la cafetera estableciendo el valor del atributo cantidadActual a 0.
     */
    @Override
    public void vaciarCafetera() {
        setCantidadActual(0);
    }

    /**
     * Llena la cafetera con una cantidad de café concreta. Si la suma de esta
     * cantidad y la cantidad actual supera el valor de la cantidad máxima lanza
     * una excepción avisando de que rebosa.
     *
     * @param cantidad cantidad de café a rellenar.
     * @throws Exception
     */
    @Override
    public void agregarCafe(int cantidad) throws Exception {
        setCantidadActual(getCantidadActual() + cantidad);
        if (getCantidadActual() > getCapacidadMaxima()) {
            setCantidadActual(getCapacidadMaxima());
            throw new Exception("Rebosa");
        }

    }

    /**
     * ç
     * Devuelve el valor del atributo capacidadMaxima
     *
     * @return the capacidadMaxima la capacidad máxima de la cafetera.
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Modifica el valor del atributo capacidadMaxima
     *
     * @param capacidadMaxima the capacidadMaxima to set
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Devuelve el valor del atributo capaciadActual
     *
     * @return the cantidadActual la cantidad actual de la cafetera.
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * Modifica el valor del atributo capacidadActual
     *
     * @param cantidadActual the cantidadActual to set
     */
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
