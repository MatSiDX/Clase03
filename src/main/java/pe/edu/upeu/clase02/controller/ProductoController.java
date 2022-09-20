package pe.edu.upeu.clase02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase02.entity.Empleado;
import pe.edu.upeu.clase02.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/all")
	public List<Empleado> readAll2(){		
		return productoService.readAll();
	}
	
	@PostMapping("/save")
	public int save(@RequestBody Empleado producto){		
		return productoService.create(producto);
	}
}
