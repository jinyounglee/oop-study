package com.example.movie;

public class Bag {
  private Long amount;
  private Invitation invitation;
  private Ticket ticket;

  public Bag(long amount) {
    this(null, amount);
  }

  public Bag(Invitation invitation, Long amount) {
    this.invitation = invitation;
    this.amount = amount;
  }

  public boolean hasTicket() {
    return ticket != null;
  }

  public boolean hasInvitation() {
    return invitation != null;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public void minusAmount(Long price) {
    this.amount -= price;
  }

  public void plusAmount(Long price) {
    this.amount += price;
  }
}
