package pe.edu.upeu.clase02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase02.entity.Alumno;
import pe.edu.upeu.clase02.service.VentaService;

@RestController
@RequestMapping("/api/venta")
public class VentaControllerr {
	@Autowired
	private VentaService service;
	
	@GetMapping("/all")
	public List<Alumno> readAll(){		
		return service.readAll();
	}
	@GetMapping("/{id}")
	public Alumno read(@PathVariable int id){		
		return service.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody Alumno venta){		
		return service.create(venta);
	}
	
	@PutMapping("/update")
	public int update(@PathVariable int id, @RequestBody Alumno venta){	
		Alumno v = service.read(id);
		v.setFecha("2022-09-15");
		return service.update(v);
	}
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return service.delete(id);
	}
	

}
