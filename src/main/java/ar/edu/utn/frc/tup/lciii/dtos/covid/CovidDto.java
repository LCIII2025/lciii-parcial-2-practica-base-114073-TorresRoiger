package ar.edu.utn.frc.tup.lciii.dtos.covid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CovidDto {
    private String NombreEstado;
    private String Sigla;
    private Date Fecha;
    private int TotalCasos;
    private int TotalPositivos;
    private int TotalHospitalizados;
}
