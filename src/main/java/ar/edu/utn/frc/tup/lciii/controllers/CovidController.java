package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.dtos.common.ErrorApi;
import ar.edu.utn.frc.tup.lciii.dtos.covid.CovidDto;
import ar.edu.utn.frc.tup.lciii.models.CovidData;
import ar.edu.utn.frc.tup.lciii.services.CovidService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/covid")
public class CovidController {
    private CovidService covidService;

    @Operation(
            summary = "Lista de casos testeados",
            description = "Lista el total de casos testeados y el total de positivos detectados agrupados por estado")
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(
                            schema = @Schema(implementation = String.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal Server Error",
                    content = @Content(
                            schema = @Schema(implementation = ErrorApi.class))
            )
    })
    @GetMapping("")
    public ResponseEntity<List<CovidData>> getAll(){
        return ResponseEntity.ok(covidService.findAll());
    }

    @GetMapping("/{estado}/{fecha}")
    public ResponseEntity<List<CovidData>> getByEstadoAndFecha(
            @PathVariable String estado,
            @PathVariable Date fecha
            ){
        return ResponseEntity.ok(covidService.findByEstadoAndFecha(estado, fecha));
    }

    @PostMapping("")
    public boolean save(@RequestBody CovidDto covidDto){
        return covidService.save(covidDto);
    }
}
