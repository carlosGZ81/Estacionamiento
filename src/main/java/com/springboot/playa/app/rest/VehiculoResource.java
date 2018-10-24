
package com.springboot.playa.app.rest;
import com.springboot.playa.app.models.entity.Vehiculo;
import com.springboot.playa.app.models.service.IVehiculoService;
import com.springboot.playa.app.models.service.util.HeaderUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;
/**
 *
 * @author Facundo
 */
@CrossOrigin
@Controller
public class VehiculoResource {
    
    private static final Logger log = LoggerFactory.getLogger(VehiculoResource.class);
    
    private static final String ENTITY_NAME = "vehiculo";

    private final IVehiculoService vehiculoService;

    public VehiculoResource(IVehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }
    
    
    @PostMapping("/vehiculo")
    public ResponseEntity<Vehiculo> createVehiculo(@RequestBody Vehiculo vehiculo) throws URISyntaxException {
        log.info("REST peticion para crear "+ENTITY_NAME+": {}");
        if (vehiculo.getId() != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No se puede crear un objeto con ese ID");
        }
        Vehiculo result = vehiculoService.saveAPI(vehiculo);
        return ResponseEntity.created(new URI("/vehiculo/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }
    
    
    @PutMapping("/vehiculo")
    public ResponseEntity<Vehiculo> updateVehiculo(@RequestBody Vehiculo vehiculo) throws URISyntaxException {
        log.debug("REST peticion para update "+ENTITY_NAME+" : {}", vehiculo);
        if (vehiculo.getId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ID null");
        }
        Vehiculo result = vehiculoService.saveAPI(vehiculo);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, vehiculo.getId().toString()))
            .body(result);
    }
    
    
    @GetMapping("/vehiculos")
    public @ResponseBody List<Vehiculo> getAllVehiculo() {
        log.debug("REST peticion de todos los "+ENTITY_NAME);
        return vehiculoService.findAll();
    }

    
    @GetMapping("/vehiculo/{id}")
    public @ResponseBody Vehiculo getVehiculo(@PathVariable Long id) {
        log.debug("REST peticion de "+ENTITY_NAME+" : {}", id);
        Vehiculo vehiculo = vehiculoService.findOne(id);
        return vehiculo;
    }

    @DeleteMapping("/vehiculo/{id}")
    public ResponseEntity<Void> deleteVehiculo(@PathVariable Long id) {
        log.debug("REST peticion para eliminar "+ENTITY_NAME+" : {}", id);
        vehiculoService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
    
}