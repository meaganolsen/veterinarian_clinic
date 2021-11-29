package com.finalproject.VeterinarianClinic.Dao;

import java.util.List;
import com.finalproject.VeterinarianClinic.entities.Appointments;

public interface AppointmentsDao {
  List<Appointments> getAppointments();
  
  Appointments postAppointments(Appointments appointments);

  Appointments updateAppointments(Appointments appointments);
  

}
