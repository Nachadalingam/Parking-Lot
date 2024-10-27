package ParkingLot.Service;

import ParkingLot.Dto.RequestTicket;
import ParkingLot.Exception.GateNotFoundException;
import ParkingLot.Exception.ParkingLotException;
import ParkingLot.Exception.ParkingSpotException;
import ParkingLot.Repository.GateRepository;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Repository.TicketRepository;
import ParkingLot.Repository.VechileRepository;
import ParkingLot.models.*;

import java.util.Date;
import java.util.UUID;

public class TicketIssuingSerice{
    private VechileRepository vechileRepository;
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;
    public TicketIssuingSerice(VechileRepository vechileRepository,
                               GateRepository gateRepository,ParkingLotRepository parkingLotRepository,
                               TicketRepository ticketRepository) {
        this.ticketRepository=ticketRepository;
        this.parkingLotRepository=parkingLotRepository;
        this.gateRepository=gateRepository;
        this.vechileRepository=vechileRepository;

    }

    public Ticket issueTickt(RequestTicket requestTicket)
            throws GateNotFoundException, ParkingLotException, ParkingSpotException {

        /*
            1. SET TIME
            2. GET VEHICLE AND GATE DETAILS
            3. GET PARKING LOT
               Assign an empty spot for this vehicle.
            4. GENERATE TICKET NUMBER
            5. SAVE AND RETURN THE TICKET
         */

        Ticket ticket=new Ticket();
        ticket.setEntryTime(new Date());

        Vechile vechile=vechileRepository.findByNumber(requestTicket.getVechileNo());
        if(vechile==null)
        {
            vechile=new Vechile(requestTicket.getVechileNo(),requestTicket.getOwnername(),requestTicket.getVechileType());
            vechileRepository.save(vechile);
        }
        ticket.setVechile(vechile);

         Gate gate=gateRepository.findById(requestTicket.getGateId());
         /*if(gate==null)
         {
           throw new GateNotFoundException();
         }*/

        ParkingLot parkingLot=parkingLotRepository.
                findByParkingLot(requestTicket.getParkingLotId());
         if(parkingLot==null)
         {
             throw new ParkingLotException();
         }
        AssignParkingSpot assignParkingSpot=requestTicket.
                getAssignParkingSpotStretegey();
         ParkingSpot parkingSpot=
                 assignParkingSpot.assignSpot(requestTicket.
                         getVechileType(),parkingLot);

         ticket.setParkingSpot(parkingSpot);
         ticket.setTicketNo(vechile.getVechileNo()+ UUID.randomUUID());
          ticketRepository.save(ticket);
          return ticket;
    }
}
