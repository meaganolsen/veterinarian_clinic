package com.finalproject.VeterinarianClinic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Appointments {
  private int appointmentId;
  private int petId;
  private String scheduledAppt;
  
  
//  @JsonIgnore
//  public int getAppointmentId() {
//    return appointmentId;
  }

//}
