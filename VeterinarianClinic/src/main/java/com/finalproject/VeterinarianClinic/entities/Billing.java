package com.finalproject.VeterinarianClinic.entities;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;
@Data
@Builder

public class Billing {
  
  private int appointmentId;
  private int clientId;
  private int petId;
  private BigDecimal balanceDue;


}
