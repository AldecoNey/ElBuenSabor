package com.example.demo.Entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaArticulo {
    private String denominacion;
    private CategoriaArticulo categoriaPadre;
    private List<CategoriaArticulo> subCategorias;
}
