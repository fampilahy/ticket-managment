package ticket_model.model.exception;

/**
 * Classe d'exception levée quand une erreur fonctionnelle survient
 *
 * @author rose
 */
public class FunctionalException extends Exception {

    /**
     * Constructeur.
     *
     * @param pMessage -
     */
    public FunctionalException(String pMessage) {
        super(pMessage);
    }


    /**
     * Constructeur.
     *
     * @param pMessage -
     * @param pCause -
     */
    public FunctionalException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }
}
