package com.finalproject.VeterinarianClinic.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.finalproject.VeterinarianClinic.entities.Clients;
import com.finalproject.VeterinarianClinic.entities.Pets;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultClientsDao implements ClientsDao{
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
   public List<Clients> getClients(){
     log.debug("DefaultClientsDao -> getClients() method called");
     final String sql = "SELECT * FROM clients";
     
     List<Clients> clients = jdbcTemplate.query(sql, new RowMapper<Clients>() {
         public Clients mapRow(ResultSet rs, int rowNum) throws SQLException {
           return Clients.builder()
               .clientId(rs.getInt("client_id"))
               .firstName(rs.getString("client_id"))
               .lastName(rs.getString("last_name"))
               .mailingAddress(rs.getString("mailing_address"))
               .city(rs.getString("city"))
               .state(rs.getString("state"))
               .zip_code(rs.getInt("zip_code"))
               .phone(rs.getString("phone"))
               .email(rs.getString("email"))
               .build();
         }
       
     });
     return clients;
   }
  
  
 
}