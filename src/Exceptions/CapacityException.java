package Exceptions;

/**
 * An exception to be thrown when an attempt is made to
 * book two events in the same room at overlaping times
 */
public class CapacityException extends Exception {

    /**
     * The constructor for an EventBookingOverlapException
     */
    public CapacityException() {
        super("You can not have more than 6 players");
    }
}
