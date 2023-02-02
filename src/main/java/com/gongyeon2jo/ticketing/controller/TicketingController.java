package com.gongyeon2jo.ticketing.controller;

import com.gongyeon2jo.ticketing.model.Ticketing;
import com.gongyeon2jo.ticketing.service.TicketingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/ticketing")
public class TicketingController {

    private final TicketingService ticketingService;

//    private final PerformanceService performanceService;

    @GetMapping("")
    public ModelAndView seat() {
        Integer performanceId = 37;
        ModelAndView modelAndView = new ModelAndView();
//        Optional<Performance> performance = performanceService.getPerformance(performanceId);
//        modelAndView.addObject("performance", performance.get());

//        Performance detail = performanceService.detail(performanceId);
//        modelAndView.addObject("detail", detail);

        List<List<String>> allSeats = ticketingService.getSeatInfo(performanceId);
        modelAndView.addObject("allSeats", allSeats);

        List<String> ticketedSeats = ticketingService.getTicketedSeats(performanceId);
        modelAndView.addObject("ticketedSeats", ticketedSeats);

        modelAndView.setViewName("ticketing/seat");
        return modelAndView;
    }

    @PostMapping("/order")
    public ModelAndView order(Ticketing ticketing) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ticketing", ticketing);
        modelAndView.setViewName("ticketing/order");
        return modelAndView;
    }

    @PostMapping("/complete")
    public ModelAndView complete(Ticketing ticketing) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ticketing", ticketing);
        modelAndView.setViewName("ticketing/complete");
        ticketingService.insert(ticketing);
        return modelAndView;
    }
}
