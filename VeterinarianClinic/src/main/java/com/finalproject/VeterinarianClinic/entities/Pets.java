package com.finalproject.VeterinarianClinic.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pets {
  private int petId;
  private int clientId;
  private String petName;
  private String petSpecies;
  private  String petBreed;
  private int petAge;
  private String petGender;
  private Boolean petFixed;

}
