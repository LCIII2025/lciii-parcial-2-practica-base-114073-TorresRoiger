package ar.edu.utn.frc.tup.lciii.services.impl;

import ar.edu.utn.frc.tup.lciii.dtos.covid.CovidDto;
import ar.edu.utn.frc.tup.lciii.models.CovidData;
import ar.edu.utn.frc.tup.lciii.repositories.CovidRepository;
import ar.edu.utn.frc.tup.lciii.services.CovidService;

import java.util.Date;
import java.util.List;

public class CovidServiceImpl implements CovidService {
    private CovidRepository covidRepository;

    @Override
    public List<CovidData> findAll() {
        return covidRepository.findAllByNombreEstado();
    }

    @Override
    public List<CovidData> findByEstadoAndFecha(String estado, Date fecha) {
        return covidRepository.findCovidDataByNombreEstadoAndFecha(estado, fecha);
    }

    @Override
    public boolean save(CovidDto covidDto) {
        CovidData covidData = new CovidData();
        covidData.setNombreEstado(covidDto.getNombreEstado());
        covidData.setSigla(covidDto.getSigla());
        covidData.setFecha(covidDto.getFecha());
        covidData.setTotalCasos(covidDto.getTotalCasos());
        covidData.setTotalPositivos(covidDto.getTotalPositivos());
        covidData.setTotalHospitalizados(covidDto.getTotalHospitalizados());

        if (covidData != null) {
            return false;
        }

        return true;
    }

}
