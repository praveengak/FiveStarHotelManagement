package com.praveen.FiveStarHotelManagement.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.praveen.FiveStarHotelManagement.entity.Room;
import com.praveen.FiveStarHotelManagement.entity.User;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {

    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumberOfGuest;
    private String bookingConfirmationCode;
    private UserDTO user;
    private RoomDTO room;
}
