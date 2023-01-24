package com.gongyeon2jo.ticketing.service;

import com.gongyeon2jo.ticketing.model.Ticketing;
import com.gongyeon2jo.ticketing.repository.TicketingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class TicketingService {

    final TicketingRepository ticketingRepository;

    @Transactional
    public void insert(Ticketing ticketing) {
        ticketingRepository.save(ticketing);
    }

}
