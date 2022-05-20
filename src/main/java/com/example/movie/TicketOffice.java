package com.example.movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

  private Long amount;

  private List<Ticket> tickets = new ArrayList<>();

  public TicketOffice(Long amout, Ticket ...tickets) {
    this.amount = amout;
    this.tickets.addAll(Arrays.asList(tickets));
  }

  public List<Ticket> getTickets() {
    return tickets;
  }

  public Ticket getTicket() {
    return this.tickets.remove(0);
  }

  public void minusAmount(Long price) {
    this.amount -= price;
  }

  public void plusAmount(Long price) {
    this.amount += price;
  }
}
