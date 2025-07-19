package ar.edu.utn.frc.tup.lciii.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class CovidData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String NombreEstado;
    @Column
    private String Sigla;
    @Column
    private Date Fecha;
    @Column
    private int TotalCasos;
    @Column
    private int TotalPositivos;
    @Column
    private int TotalHospitalizados;
}
