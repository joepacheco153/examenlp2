package pe.edu.upeu.lp2exa1davidreyna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lp2exa1davidreyna.entity.Detallepedido;
import pe.edu.upeu.lp2exa1davidreyna.entity.Usuario;
import pe.edu.upeu.lp2exa1davidreyna.security.JwtUtil;
import pe.edu.upeu.lp2exa1davidreyna.service.DetallepedidoService;

@RestController
@RequestMapping("/detalles")
public class DetallepedidoController {
	@Autowired
	private DetallepedidoService detallepedidoService;
	
	@GetMapping("/{id}")
	public Detallepedido read (@PathVariable int id) {
		try {
			return detallepedidoService.read(id);
		} catch (Exception e) {
			System.out.println("error");
			return null;
		}
		
		
	}
	
	
}
