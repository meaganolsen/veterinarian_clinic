package com.finalproject.VeterinarianClinic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Clients {
  private int clientId;
  private String firstName;
  private String lastName;
  private String mailingAddress;
  private String city;
  private String state;
  private int zip_code;
  private String phone;
  private String email;
//  @JsonIgnore
//  public int getClientId() {
//    return clientId;
//  }

}
