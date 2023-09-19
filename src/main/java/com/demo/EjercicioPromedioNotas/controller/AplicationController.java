package com.demo.EjercicioPromedioNotas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AplicationController {

    @GetMapping("/promnotas")
    public String promedioNotas(@RequestParam double n1,
                                @RequestParam double n2,
                                @RequestParam double n3){

        //Declaro variables locales para calcular el promedio
        double promedio;
        promedio = 0.00;

        //Logica para calcular el promedio
        promedio = (n1 + n2 + n3) / 3;

        return "1er Nota: "+ n1+" 2da Nota: "+ n2+" 3er Nota: "+ n3+ "  \nEl Promedio de Notas es: " + promedio;

    }


}
