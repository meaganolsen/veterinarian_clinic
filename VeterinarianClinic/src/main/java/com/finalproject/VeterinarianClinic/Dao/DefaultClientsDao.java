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
import com.finalproject.VeterinarianClinic.entities.Clients;
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
   @Override
   public Clients postClients(Clients clients) {
     //@formatter: off
     String sql = ""
         + "INSERT"
         +"INTO clients"
         +"(clientId,"
         +"firstName,"
         +"lastName,"
         +"mailingAddress,"
         +"city,"
         +"state,"
         + "zip_code,"
         +"phone,"
         +"email";
     //formatter: on
     Map<String, Object> params = new HashMap<>();
     params.put("client_Id", clients.getClientId());
     params.put("first_name", clients.getFirstName());
     params.put("last_name", clients.getLastName());
     params.put("mailing_address", clients.getMailingAddress());
     params.put("city", clients.getCity());
     params.put("state", clients.getState());
     params.put("zip_code", clients.getZip_code());
     params.put("phone", clients.getPhone());
     params.put("email", clients.getEmail());
     
     jdbcTemplate.update(sql, params);
     return Clients.builder()
         .clientId(clients.getClientId())
         .firstName(clients.getFirstName())
         .lastName(clients.getLastName())
         .mailingAddress(clients.getMailingAddress())
         .city(clients.getCity())
         .state(clients.getState())
         .zip_code(clients.getZip_code())
         .phone(clients.getPhone())
         .email(clients.getEmail())
         .build();
         
   }
  
} 
