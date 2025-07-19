package ar.edu.utn.frc.tup.lciii.services;


import ar.edu.utn.frc.tup.lciii.dtos.covid.CovidDto;
import ar.edu.utn.frc.tup.lciii.models.CovidData;

import java.util.Date;
import java.util.List;

public interface CovidService {
    List<CovidData> findAll();
    List<CovidData> findByEstadoAndFecha(String estado, Date fecha);
    boolean save(CovidDto covidDto);

}
