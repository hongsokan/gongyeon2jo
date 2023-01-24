package com.gongyeon2jo.ticketing.repository;

import com.gongyeon2jo.ticketing.model.Ticketing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketingRepository extends JpaRepository<Ticketing, String> {

    Ticketing save(Ticketing ticketing);

}
