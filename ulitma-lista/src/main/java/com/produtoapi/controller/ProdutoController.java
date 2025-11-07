package com.produtoapi.controller;
import com.produtoapi.model.Produto;
import com.produtoapi.service.ProdutoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Tag(name = "Produtos", description = "Operações básicas com produtos")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	
	@Operation(summary = "Lista todos os produtos")
	@GetMapping
	public List<Produto> listarTodos() {
		return produtoService.ListarTodos();
	}
	
	@Operation(summary = "Cadastra um novo produto")
	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		return produtoService.salvar(produto);
	}
	
	@Operation(summary = "Atualiza um produto pelo ID")
	@PutMapping("/{id}")
	public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
		return produtoService.atualizar(id, produto);
	}
	
	@Operation(summary = "Exclui um produto pelo ID")
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		produtoService.deletar(id);
	}
	
	@Operation(summary = "Busca um produto pelo ID")
	@GetMapping("/{id}")
	public Optional<Produto> findById(@PathVariable Long id) {
		return produtoService.findById(id);
	}
}
