package ar.edu.utn.frc.tup.lciii.repositories;

import ar.edu.utn.frc.tup.lciii.models.CovidData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CovidRepository extends JpaRepository<CovidData, Long> {
    List<CovidData> findAllByNombreEstado();
    List<CovidData> findCovidDataByNombreEstadoAndFecha(String estado, Date fecha);
}
