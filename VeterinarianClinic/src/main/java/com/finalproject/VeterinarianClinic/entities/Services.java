package com.finalproject.VeterinarianClinic.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Services {
  
  private int serviceId;
  private int petId;
  private String serviceType;
  private String description;

}
