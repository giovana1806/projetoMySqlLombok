package com.projexemplo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExemploController {
	@GetMapping("/")
	public String compras() {
		return "compras";
	}
	@GetMapping("/vendas")
	public String vendas() {
		return "vendas";
	}
	@GetMapping("/estoque")
	public String estoque() {
		return "estoque";
	}
}
