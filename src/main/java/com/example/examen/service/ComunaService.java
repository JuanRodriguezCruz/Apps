package com.example.examen.service;

import com.example.examen.model.Comuna;
import com.example.examen.repository.ComunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ComunaService {

    @Autowired
    private ComunaRepository repository;

    public Comuna findAvistamientos(String comuna){
        return repository.findAvistamientos(comuna);
    }


}
