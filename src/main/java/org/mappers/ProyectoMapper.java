/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mappers;

import dto.ProyectoDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.entity.Proyecto;

/**
 *
 * @author guido
 */
@Mapper(componentModel = "spring", uses = {AreaMapper.class, PersonaMapper.class, ProcesoMapper.class})
public interface ProyectoMapper {

    ProyectoDto toDto(Proyecto proyecto);

    Proyecto toEntity(ProyectoDto dto);

    List<ProyectoDto> toDto(List<Proyecto> proyectos);

    List<Proyecto> toEntity(List<ProyectoDto> proyectos);

}

