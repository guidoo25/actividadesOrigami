/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mappers;

import dto.PersonaDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.entity.Persona;

/**
 *
 * @author guido
 */
@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaDto toDto(Persona persona);

    Persona toEntity(PersonaDto dto);

    List<PersonaDto> toDto(List<Persona> personas);

    List<Persona> toEntity(List<PersonaDto> personas);

}
