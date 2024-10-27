package ParkingLot.Exception;

public class ParkingSpotException extends Exception{
    public ParkingSpotException() {
    }

    public ParkingSpotException(String message) {
        super(message);
    }

    public ParkingSpotException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotException(Throwable cause) {
        super(cause);
    }

    public ParkingSpotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
