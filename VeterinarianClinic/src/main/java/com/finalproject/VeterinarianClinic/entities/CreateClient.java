package com.finalproject.VeterinarianClinic.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateClient {
  @NotNull
  @Pattern(regexp = "[\\w\\s]*")
  private String firstName;
  
  @NotNull
  @Pattern(regexp = "[\\w\\s]*")
  private String lastName;
  
  @NotNull
  @Pattern(regexp = "[\\w\\s]*")
  private String mailingAddress;
  
  @NotNull
  @Pattern(regexp = "[\\w\\s]*")
  private String city;
  
  @NotNull
  @Pattern(regexp = "[\\w\\s]*")
  private String state;
  
  @NotNull
  private int zip_code;
  
  @NotNull
  @Pattern(regexp = "[\\w\\s]*")
  private String phone;
  
  @NotNull
  @Pattern(regexp = "[\\w\\s]*")
  private String email;
  

}
