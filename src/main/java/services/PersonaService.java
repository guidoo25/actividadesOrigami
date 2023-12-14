/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dto.PersonaDto;
import java.util.ArrayList;
import java.util.List;
import org.mappers.PersonaMapper;
import org.proyecto.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonaRepository;

/**
 *
 * @author guido
 */
@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;
    @Autowired
    private PersonaMapper mapper;

    public List<PersonaDto> consultarPersonas() {
        List<Persona> personas = repository.findAll();
        List<PersonaDto> personasDtos = mapper.toDto(personas);
//        for (Persona persona : personas) {
//            PersonaDto dto = new PersonaDto();
//            dto.setId(persona.getId());
//            dto.setNombre(persona.getNombre());
//            dto.setApellido(persona.getApellido());
//            personasDtos.add(dto);
//        }
        return personasDtos;
    }
}
