package com.I.Unidade.Projeto.backendSistema.controller;


import com.I.Unidade.Projeto.backendSistema.classes.Veiculo;
import com.I.Unidade.Projeto.backendSistema.service.ServiceOficina;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequiredArgsConstructor
@RequestMapping("veiculo")
public class ControllerOficina {

    private final ServiceOficina serviceOficina;


    @GetMapping(path = "lista")
    public ResponseEntity<List<Veiculo>> lista(){
        
        return  ResponseEntity.ok(serviceOficina.listarTudo());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Veiculo> findbyId(@PathVariable long id){
        
        return  ResponseEntity.ok(serviceOficina.findbyId(id));
    }

    @PostMapping
    public ResponseEntity<Veiculo> save(@RequestBody Veiculo veiculo){
        return new ResponseEntity<>(serviceOficina.save(veiculo), HttpStatus.CREATED);
    }
}
