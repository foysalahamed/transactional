package com.transactional.transactional.cotroller;

import com.transactional.transactional.dto.FlightBookingAcknowledgement;
import com.transactional.transactional.dto.FlightBookingRequest;
import com.transactional.transactional.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
//@RequestMapping("/api/v1")
public class FlightBooking {
//    @GetMapping("/booking")
//    public String CreateBooking(){
//        return "Booking.";
//
//    }
    @Autowired
    private FlightBookingService service;


    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return service.bookFlightTicket(request);
    }
}
