package com.finalproject.VeterinarianClinic.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
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
                .petId(rs.getInt("pet_id"))
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
  }

