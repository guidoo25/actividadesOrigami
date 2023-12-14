/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.AreaService;

/**
 *
 * @author guido
 */
public class AreaResource {
    @Autowired
    private AreaService service;
    @RequestMapping(value = "consultarArea",method = RequestMethod.GET)
 public ResponseEntity<?> consultarAreas(){
    
     return new ResponseEntity<>(service.consultarAreas(),HttpStatus.OK);
 }

    
}
