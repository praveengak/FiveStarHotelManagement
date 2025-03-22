package com.praveen.FiveStarHotelManagement.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.praveen.FiveStarHotelManagement.entity.Booking;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    public String id;
    public String email;
    public String name;
    public String phoneNumber;
    public String role;
    public List<BookingDTO> bookings = new ArrayList<>();
}
