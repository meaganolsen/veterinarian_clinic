package com.finalproject.VeterinarianClinic.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.finalproject.VeterinarianClinic.entities.Pets;
import lombok.extern.slf4j.Slf4j;

  @Component
  @Slf4j
  public class DefaultPetsDao implements PetsDao {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
     public List<Pets> getPets() {
       log.debug("DefaultPetsDao -> getPets() method called");
       final String sql = "SELECT * FROM pets";
       
         List<Pets> pets = jdbcTemplate.query(sql, new RowMapper<Pets>() {
           public Pets mapRow(ResultSet rs, int rowNum) throws SQLException {
            return Pets.builder()
                .petId(rs.getInt("id"))
                .clientId(rs.getInt("client_id"))
                .petName(rs.getString("pet_name"))
                .petSpecies(rs.getString("pet_species"))
                .petBreed(rs.getString("pet_breed"))
                .petAge(rs.getInt("pet_age"))
                .petGender(rs.getString("pet_gender"))
                .petFixed(rs.getBoolean("pet_fixed"))
                .build();
           }
         });
       return pets;
     }
     public Pets postPets(Pets pets) {
       // @formatter:off
       String sql = "" 
           + "INSERT " 
           + "INTO pets "
           + "(id, "
           + "client_id, "
           + "pet_name, "
           + "pet_species, "
           + "pet_breed, "
           + "pet_age, "
           + "pet_gender, "
           + "pet_fixed) VALUES "
           + "(:id, "
           + ":client_id, "
           + ":pet_name, "
           + ":pet_species, "
           + ":pet_breed, "
           + ":pet_age, "
           + ":pet_gender, "
           + ":pet_fixed) ";
       // @formatter:on
      
       Map<String, Object> params = new HashMap<>();
    
      params.put("id", pets.getPetId());         
       
      params.put("client_id", pets.getClientId());
      
      params.put("pet_name", pets.getPetName());
       
      params.put("pet_species", pets.getPetSpecies());
          
      params.put("pet_breed", pets.getPetBreed());
      
      params.put("pet_age", pets.getPetAge());
      
      params.put("pet_gender", pets.getPetGender());
      
      params.put("pet_fixed", pets.getPetFixed());
      
       jdbcTemplate.update(sql, params);
       return Pets.builder()
           .petId(pets.getPetId())
           .clientId(pets.getClientId())
           .petName(pets.getPetName())  
           .petSpecies(pets.getPetSpecies()) 
           .petBreed(pets.getPetBreed())
           .petAge(pets.getPetAge()) 
           .petGender(pets.getPetGender()) 
           .petFixed(pets.getPetFixed()) 
           .build();
     }
       
     @Override
     public Pets updatePets(Pets pets) {
       // @formatter:off
       String sql = "" 
           + "UPDATE " 
           + "pets "        
           + "SET "
           + "pet_name = :pet_name, "
           + "pet_species = :pet_species, "
           + "pet_breed = :pet_breed, "
           + "pet_age = :pet_age, "
           + "pet_gender = :pet_gender, "
           + "pet_fixed = :pet_fixed "
           + "WHERE id = :id AND client_id = :client_id ";
          
       // @formatter:on
      
       Map<String, Object> params = new HashMap<>();
    
      params.put("id", pets.getPetId());  
      
      params.put("client_id", pets.getClientId());
      
      params.put("pet_name", pets.getPetName());
      
      params.put("pet_species", pets.getPetSpecies());
      
      params.put("pet_breed", pets.getPetBreed());
      
      params.put("pet_age", pets.getPetAge());
      
      params.put("pet_gender", pets.getPetGender());
      
      params.put("pet_fixed", pets.getPetFixed());
       
         
       jdbcTemplate.update(sql, params);
       return Pets.builder()
           .petId(pets.getPetId())
           .clientId(pets.getClientId())
           .petName(pets.getPetName())
           .petSpecies(pets.getPetSpecies())
           .petBreed(pets.getPetBreed())
           .petAge(pets.getPetAge())
           .petGender(pets.getPetGender())
           .petFixed(pets.getPetFixed())
           .build();
     }
     
     @Override
     public Pets deletePets(Pets pets) {
       // @formatter:off
       String sql = "" 
           + "DELETE " 
           + "FROM pets "
           + "WHERE id = :id";
           
       // @formatter:on
      
       Map<String, Object> params = new HashMap<>();
    
      params.put("id", pets.getPetId());         
       
     
         
       jdbcTemplate.update(sql, params);
       return Pets.builder()
           .petId(pets.getPetId())
           .clientId(pets.getClientId())
           .petName(pets.getPetName())
           .petSpecies(pets.getPetSpecies())
           .petBreed(pets.getPetBreed())
           .petAge(pets.getPetAge())
           .petGender(pets.getPetGender())
           .petFixed(pets.getPetFixed())
           .build();
     }
      
      
  }

