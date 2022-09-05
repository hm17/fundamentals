package com.hm.fundamentals.repository;

import com.hm.fundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
