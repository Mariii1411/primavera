/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNITEC.PRIMAVERA;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/api")
public class ControladorMensajitos {
    @Autowired RepositorioMensajes mensa;
    //mi primer hola mundo desde REST API con spring
    @GetMapping(path="/hola")  //servicio mapeado con metodo get
    public String hola(){  //es un metodo
        return "Hola mundo";
    }
    
    @GetMapping(path="/mensaje") //(mensaje de la entidad 
    public List<Mensajito> todos(){
        return mensa,findAll();
}
    
//buscamos por id
    
@GetMapping(path="/mensaje/{id}")
public Mensajito buscarPorId(@PathVariable String id){
    return mensa.findById(id)get();
}
