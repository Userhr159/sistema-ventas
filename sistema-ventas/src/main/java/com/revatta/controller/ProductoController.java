package com.revatta.controller;

import com.revatta.model.Producto;
import com.revatta.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoRepository repository;

    public ProductoController(ProductoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Producto> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return repository.save(producto);
    }


}
