package system.movie_reservation.model.dto;

import system.movie_reservation.model.Ticket;
import system.movie_reservation.service.TicketService;

import java.time.LocalTime;
import java.util.List;

public record TicketResponse(Integer id,
                             String user_id,
                             String movie_id,
                             LocalTime movieTimeStart,
                             LocalTime movieTimeEnd,
                             List<String> seats,
                             Integer room_id) {

    public TicketResponse(Ticket ticket){
        this(
                ticket.getId(),
                ticket.getUser().getId(),
                ticket.getMovie().getId(),
                ticket.getMovieTime().getStartTime(),
                ticket.getMovieTime().getEndTime(),
                ticket.getSeat(),
                ticket.getRoomSeats().getId()
        );
    }
}
