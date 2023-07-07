package com.sb.TicketApplication.service;

import com.sb.TicketApplication.dao.TicketRepository;
import com.sb.TicketApplication.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    //get Ticket By ID
    public Ticket getTicketById(Integer ticketId) {

        Ticket ticket = ticketRepository.findById(ticketId).get();
        return ticket;
    }

    // get All Tickets
    public Iterable<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }


    // save the Ticket
    public Ticket SaveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }


    // update the ticket of particular property
    public Ticket updateTicket(Integer integer, String name) {

        Ticket ticket = getTicketById(integer);
        ticket.setPassengerName(name);
        ticketRepository.save(ticket);
        return ticket;
    }

    // delete the whole Ticket
    public void deleteTicket(Integer integer) {
        ticketRepository.deleteById(integer);
    }

    public Ticket updateTicketUsingJson(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
