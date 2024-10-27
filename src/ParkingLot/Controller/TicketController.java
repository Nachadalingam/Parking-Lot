package ParkingLot.Controller;

import ParkingLot.Dto.RequestTicket;
import ParkingLot.Dto.ResponseTicket;
import ParkingLot.Exception.GateNotFoundException;
import ParkingLot.Exception.ParkingLotException;
import ParkingLot.Exception.ParkingSpotException;
import ParkingLot.Service.TicketIssuingSerice;
import ParkingLot.models.Ticket;

public class TicketController {
    private TicketIssuingSerice ticketIssuingSerice;
    public TicketController(TicketIssuingSerice ticketIssuingSerice)
    {
        this.ticketIssuingSerice=ticketIssuingSerice;
    }
    public ResponseTicket issueTicket(RequestTicket requestTicket)
            throws GateNotFoundException, ParkingLotException, ParkingSpotException {;
        try {
            Ticket ticket=ticketIssuingSerice.issueTickt(requestTicket);
            return new ResponseTicket(ticket,"Success","Ticket Generated");
        }
        catch (GateNotFoundException e)
        {
            System.out.println("Gate Not found");
            return new ResponseTicket(null,"Failure","Invalid Gate");
        } catch (ParkingLotException e) {
            System.out.println("ParkingLot Not found ");
            return new ResponseTicket(null,"Failure","Invalid ParkingLot");
        } catch (ParkingSpotException e) {
            System.out.println("All the spot is filled");
            return new ResponseTicket(null, "Failure", "All the spot is filled");
        }
    }
}
