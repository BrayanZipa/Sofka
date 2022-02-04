/**
 * Representa un producto y los diferente astributos que este puede tener. 
 * @author Brayan Zipa
 */
public class Product {
    /**
     * Representa el nombre del producto.
     */
    public String name;
    /**
     * Representa el código de barras del producto.
     */
    public String barcode;
    /**
     * Representa valor o precio del producto.
     */
    public double value;
    /**
     * Representa la cantidad de existencias del producto.
     */
    public int quantity;

    /**
     * Crea una instancia de la clase Product.
     * @param name
     * @param barcode
     * @param value
     * @param quantity 
     */
    public Product(String name, String barcode, double value, int quantity) {
        this.name = name;
        this.barcode = barcode;
        this.value = value;
        this.quantity = quantity;
    }

    /**
     * Devuelve el nombre actual del producto.
     * @return Nombre actual del producto.
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Actualiza en nombre del producto.
     * @param name Nuevo nombre del producto.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el código de barras actual del producto.
     * @return Código de barras actual del producto.
     */
    public String getBarcode() {
        return this.barcode;
    }

    /**
     * Actualiza el código de barras del producto.
     * @param barcode Nuevo código de barras del producto.
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * Devuelve el valor actual del producto.
     * @return Valor actual del producto.
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Actualiza el valor del producto.
     * @param value Nuevo valor del producto.
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Devuelve la cantidad actual del producto.
     * @return Cantidad actual del producto.
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Actualiza la cantidad del producto.
     * @param quantity Nueva cantidad del producto.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}