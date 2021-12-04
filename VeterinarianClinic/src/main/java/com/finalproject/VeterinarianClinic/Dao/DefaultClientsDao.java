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
               .clientId(rs.getInt("id"))
               .firstName(rs.getString("first_name"))
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
         +" INTO clients "
         +"(first_name, "
         +"last_name, "
         +"mailing_address, "
         +"city, "
         +"state, "
         + "zip_code, "
         +"phone, "
         +"email) "
         + "VALUES "
         + "(:first_name, "
         + ":last_name, "
         + ":mailing_address, "
         + ":city, "
         + ":state, "
         + ":zip_code, "
         + ":phone, "
         + ":email)";
     log.debug(sql);
     //formatter: on
     Map<String, Object> params = new HashMap<>();
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
   @Override
   public Clients updateClients(Clients clients) {
     //@formatter:off
     final String sql = ""
         + "UPDATE "
         + "clients "
         + "SET "
         + "mailing_address = :mailing_address, "
         + "city = :city, "
         + "state = :state, "
         + "zip_code = :zip_code, "
         + "phone = :phone, "
         + "email = :email "
         + "WHERE id = :id";
     
    
     
     //formatter:on
     Map<String, Object> params = new HashMap<>();
     params.put("mailing_address", clients.getMailingAddress());
     params.put("city", clients.getCity());
     params.put("state", clients.getState());
     params.put("zip_code", clients.getZip_code());
     params.put("phone", clients.getPhone());
     params.put("email", clients.getEmail());
     params.put("id", clients.getClientId());
     
     jdbcTemplate.update(sql, params);
     return Clients.builder()
         .mailingAddress(clients.getMailingAddress())
         .city(clients.getCity())
         .state(clients.getState())
         .zip_code(clients.getZip_code())
         .phone(clients.getPhone())
         .email(clients.getEmail())
         .build();
         
   }
   @Override
   public Clients deleteClients(Clients clients) {
     //@formatter:off
     final String sql = ""
         + "DELETE "
         + "FROM clients "
         + "WHERE id = :id";
     
    
     
     //formatter:on
     Map<String, Object> params = new HashMap<>();
     params.put("id", clients.getClientId());
     
     jdbcTemplate.update(sql, params);
     return Clients.builder()
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
