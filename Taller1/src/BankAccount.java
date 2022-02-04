/**
 * Representa una cuenta bancaria y los atributos que esta posee.
 *
 * @author Brayan Zipa
 */
public class BankAccount {

    /**
     * Representa el número de la cuenta bancaria.
     */
    private int accountNumber;
    /**
     * Representa si la cuenta bancaria esta activa o no.
     */
    protected boolean activated;

    /**
     * Crea una instancia de la clase BankAccount.
     *
     * @param accountNumber
     * @param activated
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Devuelve el número actual de la cuenta bancaria.
     *
     * @return Número actual de la cuenta bancaria.
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Actualiza el número de la cuenta bancaria.
     *
     * @param accountNumber Nuevo número de la cuenta bancaria.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Devuelve el estado actual de la cuenta bancaria, si esta activa o no.
     *
     * @return True o False.
     */
    public boolean isActivated() {
        return this.activated;
    }

    /**
     * Actualiza el estado de la cuenta bancaria.
     *
     * @param activated Nuevo estado True o False.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    /**
     * Devuelve si la cuenta esta activa o no dependiendo del estado actual de la cuenta.
     * @param state Estado actual de la cuenta
     * @return  Cuenta activa o Cuenta no activa
     */
    public String state(boolean state) {
        if (state) {
            return "Cuenta activa";
        } else {
            return "Cuenta no activa";
        }
    }
}