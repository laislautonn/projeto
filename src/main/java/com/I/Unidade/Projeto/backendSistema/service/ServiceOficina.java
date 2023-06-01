package com.I.Unidade.Projeto.backendSistema.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.I.Unidade.Projeto.backendSistema.classes.Veiculo;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class ServiceOficina {

    private static List<Veiculo> veiculos;

    static{ veiculos =  new ArrayList<>(List.of(new Veiculo(1L, 4, "gfd 4583", "Corola", 
        "Toyota", "belezinha", "Semi-novo"), new Veiculo(2L, 4, "gfd 4583", "Corola", 
        "Toyota", "ta feio", "velho")));

    }

    public List<Veiculo> listarTudo(){
        return veiculos;
    }

    
    public Veiculo findbyId(long id){
        return  veiculos.stream().filter(veiculos -> veiculos.getId().equals(id))
        .findFirst()
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Veículo não encontrado"));
    }

    public Veiculo save(Veiculo veiculo){
        veiculo.setId(ThreadLocalRandom.current().nextLong(3, 10000));
        veiculos.add(veiculo);
        return veiculo;
    }
}
