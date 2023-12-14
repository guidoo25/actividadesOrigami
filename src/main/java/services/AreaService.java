/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import dto.AreaDto;
import java.util.ArrayList;
import java.util.List;
import org.mappers.AreaMapper;
import org.proyecto.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AreaRepository;

/**
 *
 * @author guido
 */
@Service
public class AreaService {

    @Autowired
    private AreaRepository repository;
    @Autowired
    private AreaMapper areaMapper;

    public List<AreaDto> consultarAreas() {
        List<Area> areas = repository.findAll();
        //List<AreaDto> areasDtos = areaMapper.toDto(areas);
        return areaMapper.toDto(areas);
    }

}
