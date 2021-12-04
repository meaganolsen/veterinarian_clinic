package com.finalproject.VeterinarianClinic.entities;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
@Data
@Builder

public class Billing {
  
  private int appointmentId;
  private int clientId;
  private int petId;
  private BigDecimal balanceDue;
 
  

public int getAppointmentId() {
  return appointmentId;
}

@JsonIgnore
public void setAppointmentId(int appointmentId) {
  this.appointmentId = appointmentId;
}

}

