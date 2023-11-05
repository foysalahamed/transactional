package com.transactional.transactional.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class Booking {
    @GetMapping("/booking")
    public String CreateBooking(){
        return "Booking.";

    }
}
