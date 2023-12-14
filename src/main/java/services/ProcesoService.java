/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import org.mappers.ProcesoMapper;
import dto.ProcesoDto;
import java.util.List;
import org.proyecto.entity.Proceso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProcesoRepository;

/**
 *
 * @author guido
 */
@Service
public class ProcesoService {

    @Autowired
    private ProcesoRepository repository;
    @Autowired
    private ProcesoMapper mapper;

    public List<ProcesoDto> consultarProcesos() {
        List<Proceso> procesos = repository.findAll();
        List<ProcesoDto> procesosDtos = mapper.toDto(procesos);
//        for (Proceso proceso : procesos) {
//            ProcesoDto dto = new ProcesoDto();
//            dto.setId(proceso.getId());
//            dto.setDescripcion(proceso.getDescripcion());
//            procesosDtos.add(dto);
//        }
        return procesosDtos;
    }

}
