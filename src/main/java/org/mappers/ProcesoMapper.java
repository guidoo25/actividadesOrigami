package org.mappers;

import dto.ProcesoDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.entity.Proceso;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guido
 */
@Mapper(componentModel = "spring")
public interface ProcesoMapper {

    ProcesoDto toDto(Proceso proceso);

    Proceso toEntity(ProcesoDto dto);

    List<ProcesoDto> toDto(List<Proceso> procesos);

    List<Proceso> toEntity(List<ProcesoDto> procesos);

}

