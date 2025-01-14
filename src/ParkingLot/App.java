package ParkingLot;

import ParkingLot.Controller.TicketController;
import ParkingLot.Dto.RequestTicket;
import ParkingLot.Exception.GateNotFoundException;
import ParkingLot.Exception.ParkingLotException;
import ParkingLot.Exception.ParkingSpotException;
import ParkingLot.Repository.GateRepository;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Repository.TicketRepository;
import ParkingLot.Repository.VechileRepository;
import ParkingLot.Service.TicketIssuingSerice;
import ParkingLot.models.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws ParkingSpotException,
            ParkingLotException, GateNotFoundException {
        /*
          You need to create a parking lot first.

         */

        Gate gate = new Gate(1l, GateType.ENTRY, GateStatus.WORKING);

        Floor floor1 = new Floor(1);

        for(int i=1; i<=10; i++) {
            floor1.getParkingSpotList().add(
                    new ParkingSpot(i, VechileType.FOUR_WHEELER,
                            ParkingSpotStatus.FILLED, floor1));
        }

        ArrayList<Floor> floors = new ArrayList<>();
        floors.add(floor1);
        ArrayList<Gate> gates = new ArrayList<>();
        gates.add(gate);

        ParkingLot parkingLot = new ParkingLot(1l, floors, gates, ParkingLotStatus.ACTIVE);


        GateRepository gateRepository = new GateRepository();
        gateRepository.getGates().put(1l, gate);

        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.getParkingLotMap().put(1l, parkingLot);

        TicketRepository ticketRepository = new TicketRepository();
        TicketService ticketService =
                new TicketService(gateRepository, vehicleRepository,
                        parkingLotRepository, ticketRepository);
        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequest issueTicketRequest = new IssueTicketRequest(
                VehicleType.FOUR_WHEELER, "KA-02",
                "Keerthi", 1l, 1l, new SimpleParkingSpotAllotmentStrategy());
        IssueTicketResponse ticketResponse = ticketController.issueTicket(issueTicketRequest);
        System.out.println(ticketResponse);











    }
}
