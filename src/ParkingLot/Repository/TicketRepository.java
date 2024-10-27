package ParkingLot.Repository;

import ParkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    Map<String, Ticket>ticketMap=new HashMap<>();
    public void save(Ticket ticket)
    {
        ticketMap.put(ticket.getTicketNo(),ticket);
    }

    public Map<String, Ticket> getTicketMap() {
        return ticketMap;
    }

    public void setTicketMap(Map<String, Ticket> ticketMap) {
        this.ticketMap = ticketMap;
    }
}
